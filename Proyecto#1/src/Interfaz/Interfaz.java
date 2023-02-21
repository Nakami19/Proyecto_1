/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import EDD.Almacen;
import EDD.Grafo;
import EDD.Product;
import EDD.Funciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tomas
 */
public class Interfaz extends javax.swing.JFrame {
    private String path;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
//       Grafo grafo1 = Global.getGrafo();
//       Almacen origin1 = new Almacen("hola");
//       Almacen origin2 = new Almacen("chao");
//       grafo1.newNode(origin1);
//       grafo1.newNode(origin2);
//        grafo1.newArista(origin1, origin2,  2);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.path=null;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        load_txt_button = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        almacen = new javax.swing.JButton();
        ruta = new javax.swing.JButton();
        save_txt_button = new javax.swing.JButton();
        Parent = new javax.swing.JPanel();
        Pedidos = new javax.swing.JPanel();
        Gestion_Stock = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        almacen_input2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        object_input = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        quantity_input = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Almacen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        almacen_input = new javax.swing.JTextField();
        insertAlmacen_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        salida_input = new javax.swing.JTextField();
        entrada_input = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        weight_input = new javax.swing.JTextField();
        weight_input2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Route = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        origin_input3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        destiny_input3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        weight_input3 = new javax.swing.JTextField();
        insertarRuta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        load_txt_button.setText("Cargar Txt");
        load_txt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_txt_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(load_txt_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton2.setText("Pedidos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButton3.setText("Gestion Stock");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        almacen.setText("Añadir Almacén");
        almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacenActionPerformed(evt);
            }
        });
        jPanel1.add(almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        ruta.setText("Añadir Ruta");
        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });
        jPanel1.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        save_txt_button.setText("Guardar en Txt");
        save_txt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_txt_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(save_txt_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 510));

        Parent.setBackground(new java.awt.Color(255, 255, 255));
        Parent.setLayout(new java.awt.CardLayout());

        Pedidos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PedidosLayout = new javax.swing.GroupLayout(Pedidos);
        Pedidos.setLayout(PedidosLayout);
        PedidosLayout.setHorizontalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PedidosLayout.setVerticalGroup(
            PedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        Parent.add(Pedidos, "card2");

        Gestion_Stock.setBackground(new java.awt.Color(255, 255, 255));
        Gestion_Stock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Gestión de Stock de los Almacenes");
        Gestion_Stock.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel9.setText("Aquí puede gestionar el Stock del almacén de su preferencia, introduzca el nombre del almacén al que quiere");
        Gestion_Stock.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel10.setText("gestionarle el Stock, introduzca el nombre del producto a añadir, su cantidad, y presione el botón para");
        Gestion_Stock.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setText("guardar los datos hechos.");
        Gestion_Stock.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel12.setText("Introduzca el nombre del Almacén al que se le va a gestionar el stock:");
        Gestion_Stock.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        Gestion_Stock.add(almacen_input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 570, -1));

        jLabel13.setText("Introduzca el nombre del Objeto que se va a introducir en el Stock del almacén:");
        Gestion_Stock.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        Gestion_Stock.add(object_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 570, -1));

        jLabel14.setText("Introduzca la cantidad del objeto que se va a introducir en el Stock del almacén:");
        Gestion_Stock.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        Gestion_Stock.add(quantity_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 570, -1));

        jButton4.setText("Añadir Objeto al Stock del Almacén");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Gestion_Stock.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        Parent.add(Gestion_Stock, "card4");

        Almacen.setBackground(new java.awt.Color(255, 255, 255));
        Almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Gestión de Almacenes");
        Almacen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setText("(no puede contener caracteres numéricos y debe ser de una letra):");
        Almacen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        almacen_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almacen_inputActionPerformed(evt);
            }
        });
        Almacen.add(almacen_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 550, 40));

        insertAlmacen_button.setText("Añadir Almacén");
        insertAlmacen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAlmacen_buttonActionPerformed(evt);
            }
        });
        Almacen.add(insertAlmacen_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel3.setText("Añadir Almacenes:");
        Almacen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setText("Añadir Rutas de Entrada:");
        Almacen.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 250, -1));

        jLabel5.setText("Introduzca el almacen entrada tomando como destino el nuevo almacen:");
        Almacen.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));
        Almacen.add(salida_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 550, -1));
        Almacen.add(entrada_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, -1));

        jLabel7.setText("Introduzca la distancia entre los dos almacenes");
        Almacen.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        Almacen.add(weight_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 550, -1));
        Almacen.add(weight_input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 550, -1));

        jLabel15.setText("Añadir Rutas de Salida:");
        Almacen.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, -1));

        jLabel16.setText("Introduzca el almacén destino tomando como origen el nuevo almacen:");
        Almacen.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel17.setText("Introduzca la distancia entre los dos almacenes");
        Almacen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setText("Introduzca el nombre del almacen que desea añadir :");
        Almacen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Parent.add(Almacen, "card3");

        Route.setBackground(new java.awt.Color(255, 255, 255));
        Route.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Gestión de Rutas");
        Route.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel19.setText("Añadir Rutas:");
        Route.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel20.setText("Introduzca el nombre del almacen de la origen de la ruta:");
        Route.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        Route.add(origin_input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 550, -1));

        jLabel21.setText("Introduzca el nombre del almacen que será el destino de la ruta:");
        Route.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        Route.add(destiny_input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 550, -1));

        jLabel22.setText("Introduzca la distancia entre los dos almacenes");
        Route.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));
        Route.add(weight_input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 550, -1));

        insertarRuta.setText("Añadir Ruta");
        insertarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarRutaActionPerformed(evt);
            }
        });
        Route.add(insertarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        Parent.add(Route, "card4");

        getContentPane().add(Parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 610, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Parent.removeAll();
        Parent.add(Pedidos);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void load_txt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_txt_buttonActionPerformed
        JFileChooser file = new JFileChooser();
        
         FileNameExtensionFilter filter = new FileNameExtensionFilter(".TXT","txt");
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setFileFilter(filter);
        int selection=file.showOpenDialog(this);

        if (selection==JFileChooser.APPROVE_OPTION) {
            
            File archive=file.getSelectedFile();
            
            String path=archive.getAbsolutePath();
            setPath(path);
            
            if(!path.contains("txt")) {
            JOptionPane.showMessageDialog(null, "Por favor elija un archivo del tipo txt");
            }
            else{
            try {
                File archivo = new File (path); 
                FileReader fr = new FileReader(archivo); 
                BufferedReader br = new BufferedReader(fr); 
                 
                String cadena;
                String complete=""; 
      
                while ((cadena=br.readLine())!=null) { 

                    if(!cadena.isEmpty()&& !cadena.isBlank()) {
                        complete+=cadena+"\n";
                    }
                }
                
                fr.close();
                br.close();

                if(!"".equals(complete)) {
 
                    String[] info;
                    Grafo grafo = Global.getGrafo();
                    String [] todo= complete.split(";");
                    String[] almacenes;
                    String[] detalles;
                    String nombre[];
                    String letra;
                    Almacen alma;
                    String[] routes=complete.split("Rutas;");
                    String[] eachroute=routes[1].split("\n");
                    String[] routeinfo;

                    for (int i = 0; i < todo.length; i++) {
                        if (todo[i].contains(":")) {
                          almacenes=todo[i].split(":");
                          nombre=almacenes[0].split(" ");
                          letra=nombre[1];
                          alma=new Almacen(letra);
                          grafo.newNode(alma);

                            info=almacenes[1].split("\n");

                              for (int j = 0; j < info.length; j++) {
                               detalles=info[j].split(",");

                               if(detalles.length>1) {
                                  alma.getListaProductos().insertEnd(new Product(detalles[0],Integer.parseInt(detalles[1])));

                               }

                            }   
                        }
                    }

                    Almacen storage;
                    
                    for (int k = 0; k < eachroute.length; k++) {
                      
                        routeinfo=eachroute[k].split(",");
                        if(!routeinfo[0].isBlank()){
                        storage=grafo.getVertice(routeinfo[0]);
                         grafo.newArista(storage,grafo.getVertice(routeinfo[1]), Integer.parseInt(routeinfo[2]));
                         storage.getListaAdyacencia().newAdjacency(grafo.getVertice(routeinfo[1]), Integer.parseInt(routeinfo[2]));
                            
                        }  
                    }
                    JOptionPane.showMessageDialog(null, "TxT cargado exitosamente");
                }

              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erorr!!!! Asegurate de haber cargado el archivo correcto");
            }
        }

      }
    }//GEN-LAST:event_load_txt_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Parent.removeAll();
        Parent.add(Gestion_Stock);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Funciones funciones=new Funciones();
        
        if(almacen_input2.getText().isBlank() || object_input.getText().isBlank() || quantity_input.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Ingreso inválido, asegúrese de que todos los valores estén correctos");
            almacen_input2.setText("");
            object_input.setText("");
            quantity_input.setText("");
            
        }
        else if(!funciones.isalpha(object_input.getText())) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre de producto sin caracteres numericos");
            object_input.setText("");
        }
        else{
            try{
                Grafo grafo = Global.getGrafo();
                
                
                Product producto = new Product(object_input.getText(), Integer.parseInt(quantity_input.getText()));
                
                Almacen almacen = grafo.getVertice(almacen_input2.getText());
                
                if(almacen == null){
                    throw new IllegalArgumentException("Uno de los almacene que introdujo no existe");
                }
                
                almacen.getListaProductos().insertEnd(producto);
                JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
                almacen_input2.setText("");
                object_input.setText("");
                quantity_input.setText("");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingreso Inválido, asegúrese de que todos los valores estén correctos");
                almacen_input2.setText("");
                object_input.setText("");
                quantity_input.setText("");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacenActionPerformed
        Parent.removeAll();
        Parent.add(Almacen);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_almacenActionPerformed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        Parent.removeAll();
        Parent.add(Route);
        Parent.repaint();
        Parent.revalidate();
    }//GEN-LAST:event_rutaActionPerformed

    private void almacen_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almacen_inputActionPerformed

    }//GEN-LAST:event_almacen_inputActionPerformed

    private void insertAlmacen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAlmacen_buttonActionPerformed
        String data ="";
        if (Global.getGrafo().getFirst()!=null){
            Funciones funciones=new Funciones();
            if(almacen_input.getText().isBlank()|| !funciones.isalpha(almacen_input.getText())){
                JOptionPane.showMessageDialog(null, "Ingreso Inválido, por favor ingrese el nombre del Almacén");
                almacen_input.setText("");
            }
            else if(almacen_input.getText().length()>1) {
                JOptionPane.showMessageDialog(null, "Ingreso Inválido, por favor ingrese el nombre del Almacén");
                almacen_input.setText("");
            }
            else{
                Grafo grafo = Global.getGrafo();
                data = almacen_input.getText();
                Almacen almacen = new Almacen(data);

                
            
                if(salida_input.getText().isBlank() || entrada_input.getText().isBlank() || weight_input.getText().isBlank()){
                    JOptionPane.showMessageDialog(null, "Ingreso inválido, asegúrese de que todos los valores estén correctos");
                        
                }
                else if (grafo.existVertice(almacen)){ JOptionPane.showMessageDialog(null, "El almacen ingresado ya existe");}
                
                else{
                    try{
                        grafo.newNode(almacen);
                        data = almacen_input.getText();
                        Grafo grafo1 = Global.getGrafo();
                        Grafo grafo2 = Global.getGrafo();
                        Almacen origin1 = new Almacen(data);
                        Almacen destiny1 = new Almacen(salida_input.getText());
                        int weight1 = Integer.parseInt(weight_input.getText());
                        Almacen origin2 = new Almacen(entrada_input.getText());
                        Almacen destiny2 = new Almacen(data);
                        int weight2 = Integer.parseInt(weight_input2.getText());

                        if(grafo2.existVertice(origin2) && grafo2.existVertice(destiny2) && grafo1.existVertice(origin1) && grafo1.existVertice(destiny1)){
                            grafo2.newArista(origin2, destiny2, weight2);
                            grafo1.newArista(origin1, destiny1, weight1);
                            JOptionPane.showMessageDialog(null, "registrados exitosamente CRACK");
                            almacen_input.setText("");
                            salida_input.setText("");
                            entrada_input.setText("");
                            weight_input.setText("");
                            weight_input2.setText("");

                        }else{
                            throw new IllegalArgumentException("Uno de los almacene que introdujo no existe");
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Ingreso inválido de datos de la ruta, asegúrese de que todos los valores estén correctos");

                    }
            }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay almacenes registrados, por favor lee el TXT antes de registrar un almacen");
        }
    }//GEN-LAST:event_insertAlmacen_buttonActionPerformed

    private void insertarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarRutaActionPerformed
        if (Global.getGrafo().getFirst()!=null){

            if(origin_input3.getText().isBlank() || destiny_input3.getText().isBlank() || weight_input3.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Ingreso inválido, asegúrese de que todos los valores estén correctos");
                origin_input3.setText("");
                destiny_input3.setText("");
                weight_input.setText("");
            }else{
                try{
                    Grafo grafo = Global.getGrafo();
                    Almacen origin = new Almacen(origin_input3.getText());
                    Almacen destiny = new Almacen(destiny_input3.getText());
                    int weight = Integer.parseInt(weight_input3.getText());

                    if(grafo.existVertice(origin) && grafo.existVertice(destiny)){
                        grafo.newArista(origin, destiny, weight);
                        origin_input3.setText("");
                        destiny_input3.setText("");
                        weight_input3.setText("");
                        JOptionPane.showMessageDialog(null, "Ruta registrada exitosamente");
                    }else{
                        throw new IllegalArgumentException("Uno de los almacene que introdujo no existe");
                    }

                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Ingreso inválido, asegúrese de que todos los valores estén correctos");
                    origin_input3.setText("");
                    destiny_input3.setText("");
                    weight_input3.setText("");
                }
            }}else{
                JOptionPane.showMessageDialog(null, "No hay almacenes registrados, por favor lee el TXT antes de registrar un almacen");
            }
    }//GEN-LAST:event_insertarRutaActionPerformed

    private void save_txt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_txt_buttonActionPerformed
       Grafo grafo = Global.getGrafo();
       
       String almacenes=grafo.saveproducts();
       String rutas=grafo.saveroute();
       String todo=almacenes+rutas;
       todo=todo.trim();
       
             try {
            if(getPath()!=null) {
            PrintWriter pw=new PrintWriter(getPath());
            pw.print(todo);
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exitoso");}
            else{JOptionPane.showMessageDialog(null, "Error!! Primero debe cargar un archivo txt");}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!!!!!");
        } 
    }//GEN-LAST:event_save_txt_buttonActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Almacen;
    private javax.swing.JPanel Gestion_Stock;
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel Pedidos;
    private javax.swing.JPanel Route;
    private javax.swing.JButton almacen;
    private javax.swing.JTextField almacen_input;
    private javax.swing.JTextField almacen_input2;
    private javax.swing.JTextField destiny_input3;
    private javax.swing.JTextField entrada_input;
    private javax.swing.JButton insertAlmacen_button;
    private javax.swing.JButton insertarRuta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton load_txt_button;
    private javax.swing.JTextField object_input;
    private javax.swing.JTextField origin_input3;
    private javax.swing.JTextField quantity_input;
    private javax.swing.JButton ruta;
    private javax.swing.JTextField salida_input;
    private javax.swing.JButton save_txt_button;
    private javax.swing.JTextField weight_input;
    private javax.swing.JTextField weight_input2;
    private javax.swing.JTextField weight_input3;
    // End of variables declaration//GEN-END:variables
}
