/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.com.hyunseda.market.presentation;




import co.com.hyunseda.entities.order.ShoppingCart;
import co.com.hyunseda.presentation.order.GUIProductInfo;
import co.com.hyunseda.presentation.order.GUIShoppingCart;
import co.com.hyunseda.service.order.ShoppingCartService;

import com.raven.model.ModelItem;
import com.unicauca.clientproducthttpclient.domain.entities.Product;
import com.unicauca.clientproducthttpclient.domain.services.ProductService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author X1605
 */
public class GUIGuest extends javax.swing.JFrame {
    private ProductService productService;
    //private ShoppingCarService shoppingCarService;
    
    private ShoppingCart shoppingCar = new ShoppingCart();
    private ShoppingCartService shoppingCarService = new ShoppingCartService(shoppingCar);
    
    GUIShoppingCart shoppingCartGraphic = new GUIShoppingCart(shoppingCarService);
    /**
     * Creates new form GUIGuest
     */
    public GUIGuest() {
        initComponents();
        initializeTable();
        setLocationRelativeTo(null); //centrar al ventana
    }
    
     public GUIGuest(ProductService productService) {
        initComponents();
        initializeTable();
        //this.shoppingCarService = shoppingCarService;
        this.productService = productService;
        setLocationRelativeTo(null); //centrar al ventana
        shoppingCarService.addObserver(shoppingCartGraphic);
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
        jLabel1 = new javax.swing.JLabel();
        rdoId = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        rdoCat = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCategories = new javax.swing.JList<>();
        btnSearch = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        agregarCarritoVisitante = new javax.swing.JButton();
        carritoCompras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar por:");

        rdoId.setSelected(true);
        rdoId.setText("Id");
        rdoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIdActionPerformed(evt);
            }
        });

        rdoName.setText("Nombre del producto");
        rdoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNameActionPerformed(evt);
            }
        });

        txtSearch.setPreferredSize(new java.awt.Dimension(62, 32));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        rdoCat.setText("Categoria(s)");
        rdoCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCatActionPerformed(evt);
            }
        });

        jScrollPane3.setPreferredSize(new java.awt.Dimension(100, 146));

        jScrollPane3.setViewportView(listCategories);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSearchAll.setText("Buscar Todos");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(15, 15, 15)
                    .addComponent(rdoId)
                    .addGap(15, 15, 15)
                    .addComponent(rdoName)
                    .addGap(15, 15, 15)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(rdoCat)
                    .addGap(15, 15, 15)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(btnSearch)
                    .addGap(15, 15, 15)
                    .addComponent(btnSearchAll)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(rdoId))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(rdoName))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(rdoCat))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(btnSearch))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(btnSearchAll)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);

        agregarCarritoVisitante.setText("Agregar al carrito");
        agregarCarritoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCarritoVisitanteActionPerformed(evt);
            }
        });
        jPanel2.add(agregarCarritoVisitante);

        carritoCompras.setText("Carrito de compras");
        carritoCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoComprasActionPerformed(evt);
            }
        });
        jPanel2.add(carritoCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoIdActionPerformed

    private void rdoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void rdoCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(rdoId.isSelected()){

            if(!(txtSearch.getText().equals(""))){
                Long c = null;
                try{
                    c = Long.parseLong(txtSearch.getText());
                    if(productService.findById(c) == null){
                        Messages.showMessageDialog("No se han encontrado resultados de la busqueda", "Atención");
                    }else{
                        fillProduct(productService.findById(c));
                    }
                }catch(NumberFormatException e){
                    Messages.showMessageDialog("Ha ingresado caracteres que no son numeros, se esperaba la id de un producto", "Atención");
                }
            }else{
                Messages.showMessageDialog("Debe ingresar el id el producto", "Atención");
            }
        }else if(rdoName.isSelected()){
            if(!(txtSearch.getText().equals(""))){
                if(productService.findProductByName(txtSearch.getText())== null){
                    Messages.showMessageDialog("No se han encontrado resultados de la busqueda", "Atención");
                }else{
                    //fillTable(productService.findProductByName(txtSearch.getText()));
                }
            }else{
                Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
            }
        }else{
            List<String> catSelect = listCategories.getSelectedValuesList();
            //fillTable(productService.findProductByCategories(catSelect));
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        if(productService.findAll().isEmpty()){
            Messages.showMessageDialog("No se han encontrado productos", "Atención");
        }else{
            List<Product> pr = productService.findAll();
            for(Product asd: pr){
                System.out.println("Descripcion: "+asd.getDescription());
                System.out.println("Slug: "+asd.getSlug());
                System.out.println("price: "+asd.getPrice());
                System.out.println("stock: "+asd.getStock());
                System.out.println("keywwords: "+asd.getKeywords());
                System.out.println("Slug: "+asd.getImages());
                System.out.println("caracteristicas: "+asd.getCharacteristics());
                System.out.println("categorias: "+asd.getCategories());
            }
            fillTable(productService.findAll());
        }

    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void agregarCarritoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCarritoVisitanteActionPerformed
        // TODO add your handling code here:
     List<ModelItem> elementosSeleccionados = obtenerElementosSeleccionados(tblProducts);
    GUIProductInfo info = new GUIProductInfo(shoppingCarService);
    info.setVisible(true);

// Iterar sobre los elementos seleccionados
for (ModelItem item : elementosSeleccionados) {
    System.out.println("Seleccionado: " + item.getItemID() + ", " + item.getItemName() + ", " + item.getDescription());
    int itemId = item.getItemID(); // Obtener el ID del item
long itemIdLong = (long) itemId; // Convertir el ID a tipo long
Product product = productService.findById(itemIdLong); // Llamar a findProductById con el ID convertido
    
    // Establecer el producto en la interfaz gráfica de información del producto
    info.setProduct(product);
    info.mostrarInfo();
}


    }//GEN-LAST:event_agregarCarritoVisitanteActionPerformed

    private void carritoComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoComprasActionPerformed
        // TODO add your handling code here:

        shoppingCartGraphic.setVisible(true);

        //shoppingCarGraphic.setVisible(true);
        //shoppingCarService.addObserver(shoppingCarGraphic);
    }//GEN-LAST:event_carritoComprasActionPerformed

    private void initializeTable() {
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id","Name", "Description"
                }
        ));
    }
     private void fillTable(List<Product> listProducts) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[3];//No columnas
        for (int i = 0; i < listProducts.size(); i++) {
            rowData[0] = listProducts.get(i).getProductId();
            rowData[1] = listProducts.get(i).getName();
            rowData[2] = listProducts.get(i).getDescription();
            
            model.addRow(rowData);
        }
       
    }
private void fillProduct(Product p) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[3];//No columnas
        rowData[0] = p.getProductId();
        rowData[1] = p.getName();
        rowData[2] = p.getDescription();
        model.addRow(rowData);
    }
private static List<ModelItem> obtenerElementosSeleccionados(javax.swing.JTable table) {
          int[] filasSeleccionadas = table.getSelectedRows();
    List<ModelItem> elementosSeleccionados = new ArrayList<>();

    for (int fila : filasSeleccionadas) {
        // Obtener el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        // Obtener el índice real de la fila seleccionada en el modelo
        int rowIndex = table.convertRowIndexToModel(fila);
        
        // Obtener el item seleccionado en la fila del modelo
        ModelItem item = (ModelItem) model.getValueAt(rowIndex, 0); // Suponiendo que el objeto está en la primera columna
        
        // Agregar el item seleccionado a la lista
        elementosSeleccionados.add(item);
    }

    return elementosSeleccionados;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCarritoVisitante;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JButton carritoCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listCategories;
    private javax.swing.JRadioButton rdoCat;
    private javax.swing.JRadioButton rdoId;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
