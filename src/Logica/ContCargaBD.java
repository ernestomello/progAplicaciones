/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.BDCulturarte;
import Persistencia.estadoPersistencia;
import Persistencia.propuestasPersistencia;
import Persistencia.usuariosPersistencia;
import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ContCargaBD implements iContCargaBD {
//import clases

    private static ContCargaBD instance;
    private BDCulturarte bdCul = new BDCulturarte();
    private usuariosPersistencia usuPersistencia = new usuariosPersistencia();
    private propuestasPersistencia propPersistencia = new propuestasPersistencia();
    private estadoPersistencia estadoPersistencia = new estadoPersistencia();

//arreglos dt para carga -- filtrados!
    private ArrayList<dtUsuario> usuariosPer = new ArrayList<>();
    private ArrayList<dtCategoria> categoriasPer = new ArrayList<>();
    private ArrayList<dtEstado> estadosPer = new ArrayList<>();
    private ArrayList<dtPropuestasBD> propuestasPer = new ArrayList<>();
    private ArrayList<dtColaboracionCompleto> colaboracionesPer = new ArrayList<>();
    private ArrayList<dtEstadosPropuestas> estadosPropuestaPer = new ArrayList<>();
    private ArrayList<dtSeguidores> seguidoresUPer = new ArrayList<>();
//arreglos primitivos para carga -- bruto
    private ArrayList<String> usuPer = new ArrayList<>();
    private ArrayList<String> propPer = new ArrayList<>();
    private ArrayList<dtColaboraciones> colPer = new ArrayList<>();
    private ArrayList<dtEstadosPropuestas> estaPropPer = new ArrayList<>();
    private ArrayList<dtSeguidores> seguidoresPer = new ArrayList<>();

    public static ContCargaBD getInstance() {
        if (instance == null) {
            instance = new ContCargaBD();
        }
        return instance;
    }

    public ContCargaBD() {

    }
//funciones levantar per -3-

    public void levantaBDusuPer() {
        bdCul.levantaUsusOrigin(usuPer);
    }

    public void levantarBDproPer() {
        bdCul.levantarPropuestasOrigin(propPer);
    }

    public void levantarBDcolPer() {
        bdCul.levantarColaboracionesOrigin(colPer);
    }

    public void levantarBDestadosPropPer() {
        bdCul.levantarEstadosOrigin(estaPropPer);
    }

    public void levantarBDseguidoresPer() {
        bdCul.levantarSeguidoresOrigin(seguidoresPer);
    }

    public boolean limpiarCargar() {

        try {

            if (truncarPropuestas()) {
                System.out.println("ok propuestas");
            }
            if (truncarUsuarios()) {
                System.out.println("ok usuarios");
            }

            if (cargarDatos()) {
                System.out.println("OK CARGA....");
            }
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean cargarDatos() {

        try {
            cargarUsuarios();
            cargarEstados();
            cargarCategorias();
            cargarPropuestas();
            cargarColaboraciones();
            cargarEstadosPropuestas();
            cargarSeguidores();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public void setearCategoria(ArrayList<dtCategoria> dtcate) {

        for (int i = 0; i < dtcate.size(); i++) {
            dtCategoria dtcat = dtcate.get(i);
            categoriasPer.add(dtcat);
        }

    }

    public void setearEstado(ArrayList<dtEstado> estadosV) {
        try {

            for (int i = 0; i < estadosV.size(); i++) {
                dtEstado e = (dtEstado) estadosV.get(i);
                estadosPer.add(e);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private boolean comparaFecha(dtFecha fecha1, dtFecha fecha2) {
        String fecha = null, fechacomp = null;
        fecha = fecha1.getFecha();
        fechacomp = fecha2.getFecha();
        return fechacomp.equals(fecha);
    }

    public void setearEstadoPropuesta(dtEstadosPropuestas estProp) {
        try {
            for (int i = 0; i < estaPropPer.size(); i++) {
                dtEstadosPropuestas dtcontrol = (dtEstadosPropuestas) estaPropPer.get(i);
                String estado = null, titulo = null;
                estado = dtcontrol.getEstado();
                titulo = dtcontrol.getTituloprop();
                dtFecha fecha = dtcontrol.getFecha();
                if (estProp.getEstado().equals(estado)) {
                    if (estProp.getTituloprop().equals(titulo)) {
                        if (comparaFecha(estProp.getFecha(), fecha)) {
                            estadosPropuestaPer.add(estProp);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean compruebaSeguidores(dtSeguidores ori, dtSeguidores comparar) {
        String nickusuarioORI = ori.getNickusuario(), nickaseguirORI = ori.getNickaseguir();
        String nickusuarioCOMP = comparar.getNickusuario(), nickaseguirCOMP = comparar.getNickaseguir();
        if (nickusuarioORI.equals(nickusuarioCOMP)) {
            if (nickaseguirORI.equals(nickaseguirCOMP)) {
                return true;
            }
        }
        return false;
    }

    public void seteardtSeguidores(dtSeguidores dtseg) {
// filtro seguidoresPer 

        try {
            for (int i = 0; i < seguidoresPer.size(); i++) {
                dtSeguidores control = (dtSeguidores) seguidoresPer.get(i);
                if (compruebaSeguidores(dtseg, control)) {
                    seguidoresUPer.add(dtseg);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    public void agregardtusu(dtUsuario us) {
        try {
            for (int i = 0; i < usuPer.size(); i++) {
                String usuN = usuPer.get(i);
                if (us.getNickname().equals(usuN)) {
                    usuariosPer.add(us);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void agregardtpropuesta(ArrayList<dtPropuestasBD> dtpropuesta) {
        try {
            for (int p = 0; p < dtpropuesta.size(); p++) {
                dtPropuestasBD dtprop = (dtPropuestasBD) dtpropuesta.get(p);
                for (int i = 0; i < propPer.size(); i++) {
                    String tituloP = propPer.get(i);
                    if (dtprop.getTitulo().equals(tituloP)) {
                        propuestasPer.add(dtprop);
                    }

                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void agregardtcolaboraciones(dtColaboracionCompleto dtcol) {
        try {
            for (int i = 0; i < colPer.size(); i++) {
                dtColaboraciones dtcola = colPer.get(i);
                if ((dtcol.getNickname().equals(dtcola.getNickname()) == true) && (dtcol.getTitulo().equals(dtcola.getIdPropuesta()))) {
                    if (comparaFecha(dtcol.getFecha(), dtcola.getFecha())) {
                        colaboracionesPer.add(dtcol);
                    }

                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     *
     */
    private void cargarUsuarios() {
        for (int i = 0; i < usuariosPer.size(); i++) {
            try {
                dtUsuario usuAlta = (dtUsuario) usuariosPer.get(i);
                bdCul.altaUsuario(usuAlta);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    private void cargarEstados() {
        try {
            for (int i = 0; i < estadosPer.size(); i++) {
                dtEstado esta = (dtEstado) estadosPer.get(i);
                bdCul.agregarEstadoCD(esta);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private void cargarCategorias() {
        try {
            for (int i = 0; i < categoriasPer.size(); i++) {
                dtCategoria dtcat = categoriasPer.get(i);
                bdCul.altaCategoriaCD(dtcat);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void cargarPropuestas() {
        for (int i = 0; i < propuestasPer.size(); i++) {//revisar 
            dtPropuestasBD prop = (dtPropuestasBD) propuestasPer.get(i);
            bdCul.altaPropuestaCD(prop);
        }
    }

    private void cargarColaboraciones() {
        try {
            for (int i = 0; i < colaboracionesPer.size(); i++) {//rev
                dtColaboracionCompleto dtcola = (dtColaboracionCompleto) colaboracionesPer.get(i);
                bdCul.altaColaboracionCD(dtcola);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void cargarEstadosPropuestas() {
        try {
            for (int i = 0; i < estadosPropuestaPer.size(); i++) {
                dtEstadosPropuestas estaprop = (dtEstadosPropuestas) estadosPropuestaPer.get(i);
                bdCul.agregarPropEstadoCD(estaprop);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void cargarSeguidores() {
        try {
            for (int i = 0; i < seguidoresUPer.size(); i++) {
                dtSeguidores sig = seguidoresUPer.get(i);
                bdCul.agregarSeguidoresCD(sig);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }

    private void cargaOrigin() {
        if (cargaUsuariosOrigin()) {
            System.out.println("okUsusOrigin");
        }
        if (cargaPropuestasOrigin()) {
            System.out.println("okPropOrigin");
        }
        if (cargaColaboracionesOrigin()) {
            System.out.println("okColaOrigin");
        }
        if (cargaEstadoPropuestasOrigin()) {
            System.out.println("okPropEstOrigin");
        }
        if (cargaSeguidoresOrigin()) {
            System.out.println("okSegiOrigin");
        }

    }

    private boolean cargaUsuariosOrigin() {
        //usuPer
        try {
            for (int i = 0; i < usuPer.size(); i++) {
                String usu = usuPer.get(i);
                bdCul.cargaUsuariosOrigin(usu);
            }
            return true;
        } catch (Exception e) {

            System.err.println(e.getMessage());
            return false;

        }

    }

    private boolean cargaPropuestasOrigin() {
        try {
            for (int i = 0; i < propPer.size(); i++) {
                String prop = propPer.get(i);
                bdCul.cargaPropuestasOrigin(prop);
            }
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;

        }

    }

    private boolean cargaEstadoPropuestasOrigin() {
        try {
            for (int i = 0; i < estaPropPer.size(); i++) {
                dtEstadosPropuestas esta = (dtEstadosPropuestas) estaPropPer.get(i);
                bdCul.cargaEstadoPropuestasOrigin(esta);
            }
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

    private boolean cargaSeguidoresOrigin() {
        //seguidoresPer
        try {
            for (int i = 0; i < seguidoresPer.size(); i++) {
                dtSeguidores sig = seguidoresPer.get(i);
                bdCul.cargaSeguidoresOrigin(sig);
            }
            return true;
        } catch (Exception e) {
            return false;

        }

    }

    private boolean cargaColaboracionesOrigin() {
        //colper
        try {
            for (int i = 0; i < colPer.size(); i++) {
                dtColaboraciones cola = (dtColaboraciones) colPer.get(i);
                bdCul.cargaColaboracionesOrigin(cola);
            }
            return true;
        } catch (Exception e) {
        }

        return false;
    }

    private boolean truncarTablas() {

        return bdCul.truncarPer();
    }

    private boolean truncarUsuarios() {
        return bdCul.truncarUsuario();

    }

    private boolean truncarPropuestas() {
        return bdCul.truncarPropuesta();
    }

    void borrarColecciones() {
        this.categoriasPer.clear();
        System.out.println("vacio CategoriasPer");
        this.colPer.clear();
        System.out.println("vacio colPer");
        this.colaboracionesPer.clear();
        System.out.println("vacio colaboracionesPer");
        this.estaPropPer.clear();
        System.out.println("vacio estaPropPer");
        this.estadosPer.clear();
        System.out.println("vacio estadosPer");
        this.estadosPropuestaPer.clear();
        System.out.println("vacio estadosPropuestaPer");
        this.propPer.clear();
        System.out.println("vacio propPer");
        this.propuestasPer.clear();
        System.out.println("vacio propuestasPer");
        this.seguidoresPer.clear();
        System.out.println("vacio seguidoresPer");
        this.seguidoresUPer.clear();
        System.out.println("vacio seguidoresUsPer");
        this.usuPer.clear();
        System.out.println("vacio usuPer");
        this.usuariosPer.clear();
        System.out.println("vacio usuariosPer");
        System.out.println("vacio TODO");

    }

}
