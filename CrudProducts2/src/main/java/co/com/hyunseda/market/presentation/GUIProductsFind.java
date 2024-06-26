/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.hyunseda.market.presentation;

//import co.com.hyunseda.market.market.Product;
//import co.com.hyunseda.market.service.ProductService;
//import co.com.hyunseda.market.service.CategoryService;
//import co.com.hyunseda.market.market.Category;
import com.unicauca.clientproducthttpclient.domain.entities.Category;
import com.unicauca.clientproducthttpclient.domain.entities.Product;
import com.unicauca.clientproducthttpclient.domain.services.CategoryService;
import com.unicauca.clientproducthttpclient.domain.services.ProductService;
import java.util.ArrayList;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class GUIProductsFind extends javax.swing.JDialog {
    DefaultListModel<String> model = new DefaultListModel<>();
    private ProductService productService;
    private CategoryService categoryService;
  
    /**
     * Creates new form GUIProductsFind
     */
    public GUIProductsFind(java.awt.Frame parent, boolean modal,ProductService productService, CategoryService categoryService) {
        super(parent, modal);
        initComponents();
        initializeTable();
        this.productService = productService;
        this.categoryService = categoryService;
        setLocationRelativeTo(null); //centrar al ventana
        initCats();
    }
    
    private void initializeTable() {
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Name", "Description", "Slug", "Price", "Stock", "Keywords", "Images", "Characteristics", "Categories"
                }
        ));
    }
    
    public void initCats(){
        
        listCategories.setModel(model);
        List<Category> cats = categoryService.findAll();
        for(Category cat : cats){
            System.out.println(cat.getName());
            model.addElement(cat.getName());
        }
    }
    
    private void fillTable(List<Product> listProducts) {
    initializeTable();
    DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

    Object rowData[] = new Object[10];//No columnas
    for (int i = 0; i < listProducts.size(); i++) {
        rowData[0] = listProducts.get(i).getProductId();
        rowData[1] = listProducts.get(i).getName();
        rowData[2] = listProducts.get(i).getDescription();
        rowData[3] = listProducts.get(i).getSlug();
        rowData[4] = listProducts.get(i).getPrice();
        rowData[5] = listProducts.get(i).getStock();
        rowData[6] = listProducts.get(i).getKeywords();
        rowData[7] = listProducts.get(i).getImages();
        rowData[8] = listProducts.get(i).getCharacteristics();
       // Usar StringBuilder para concatenar los nombres de las categorías
    StringBuilder categoriesConcatenated = new StringBuilder();
    for (int j = 0; j < listProducts.get(i).getCategories().size(); j++) {
        categoriesConcatenated.append(listProducts.get(i).getCategories().get(j).getName());
        if (j < listProducts.get(i).getCategories().size() - 1) {
            categoriesConcatenated.append(", "); // Separador entre categorías
        }
    }

    // Asignar la cadena concatenada a la celda correspondiente
        rowData[9] = categoriesConcatenated.toString();
        System.out.println(" numero de categorias asociadas! : "+listProducts.get(i).getCategories().size());
        model.addRow(rowData);
   }
       
 }
      private void fillTable2(Product listProducts) {
    initializeTable();
    DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
          
    Object rowData[] = new Object[10];
        
        rowData[0] = listProducts.getProductId();
        rowData[1] = listProducts.getName();
        rowData[2] = listProducts.getDescription();
        rowData[3] = listProducts.getSlug();
        rowData[4] = listProducts.getPrice();
        rowData[5] = listProducts.getStock();
        rowData[6] = listProducts.getKeywords();
        rowData[7] = listProducts.getImages();
        rowData[8] = listProducts.getCharacteristics();
     
        StringBuilder categoriesConcatenated = new StringBuilder();
        for (int j = 0; j < listProducts.getCategories().size(); j++) {
            categoriesConcatenated.append(listProducts.getCategories().get(j).getName());
            if (j < listProducts.getCategories().size() - 1) {
                categoriesConcatenated.append(", ");
            }
            rowData[9] = categoriesConcatenated.toString();

       }
        model.addRow(rowData);
       
 }
    
    
    
    private void fillProduct(Product p) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[10];//No columnas
        rowData[0] = p.getProductId();
        rowData[1] = p.getName();
        rowData[2] = p.getDescription();
        rowData[3] = p.getSlug();
        rowData[4] = p.getPrice();
        rowData[5] = p.getStock();
        rowData[6] = p.getKeywords();
        rowData[7] = p.getImages();
        rowData[8] = p.getCharacteristics();
     
        StringBuilder categoriesConcatenated = new StringBuilder();
        for (int j = 0; j < p.getCategories().size(); j++) {
            categoriesConcatenated.append(p.getCategories().get(j).getName());
            if (j < p.getCategories().size() - 1) {
                categoriesConcatenated.append(", ");
            }
            rowData[9] = categoriesConcatenated.toString();

       }
        model.addRow(rowData);
    }
    
    
    private void fillTableCat(List<Product> listProducts) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[10];//No columnas
        for (int i = 0; i < listProducts.size(); i++) {
            rowData[0] = listProducts.get(i).getProductId();
            rowData[1] = listProducts.get(i).getName();
            rowData[2] = listProducts.get(i).getDescription();
            rowData[3] = listProducts.get(i).getSlug();
            rowData[4] = listProducts.get(i).getPrice();
            rowData[5] = listProducts.get(i).getStock();
            rowData[6] = listProducts.get(i).getKeywords();
            rowData[7] = listProducts.get(i).getImages();
            rowData[8] = listProducts.get(i).getCharacteristics();
            
            StringBuilder categoriesConcatenated = new StringBuilder();
            for (int j = 0; j < listProducts.get(i).getCategories().size(); j++) {
                categoriesConcatenated.append(listProducts.get(i).getCategories().get(j).getName());
                if (j < listProducts.get(i).getCategories().size() - 1) {
                    categoriesConcatenated.append(", "); // Separador entre categorías
                }
            }
            
            rowData[9] = categoriesConcatenated.toString();
            System.out.println(" numero de categorias asociadas! : "+listProducts.get(i).getCategories().size());
            model.addRow(rowData);
        }

    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        pnlNorth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoId = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        rdoCat = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCategories = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de productos");

        pnlCenter.setLayout(new java.awt.BorderLayout());

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

        pnlCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        java.awt.GridBagLayout pnlNorthLayout = new java.awt.GridBagLayout();
        pnlNorthLayout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        pnlNorthLayout.rowHeights = new int[] {0};
        pnlNorth.setLayout(pnlNorthLayout);

        jLabel1.setText("Buscar por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(jLabel1, gridBagConstraints);

        buttonGroup1.add(rdoId);
        rdoId.setSelected(true);
        rdoId.setText("Id");
        rdoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(rdoId, gridBagConstraints);

        buttonGroup1.add(rdoName);
        rdoName.setText("Nombre del producto");
        rdoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(rdoName, gridBagConstraints);

        txtSearch.setPreferredSize(new java.awt.Dimension(62, 32));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(txtSearch, gridBagConstraints);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(btnSearch, gridBagConstraints);

        btnSearchAll.setText("Buscar Todos");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(btnSearchAll, gridBagConstraints);

        buttonGroup1.add(rdoCat);
        rdoCat.setText("Categoria(s)");
        rdoCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(rdoCat, gridBagConstraints);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(100, 146));

        jScrollPane3.setViewportView(listCategories);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        pnlNorth.add(jScrollPane3, gridBagConstraints);

        getContentPane().add(pnlNorth, java.awt.BorderLayout.PAGE_START);

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
                System.out.println("categorias: "+asd.getCategories().get(0).getName());
            }
            fillTable(productService.findAll());
        }
        
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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
                // crear metodo en el microservicio
                
               if(productService.findProductByName(txtSearch.getText())==null){
                    Messages.showMessageDialog("No se han encontrado resultados de la busqueda", "Atención");
                }else{
                //crear metodo en el microservicio
                
                   fillTable2(productService.findProductByName(txtSearch.getText()));
                }
            }else{
                Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
            }
    /*    }else{
            List<String> catSelect = listCategories.getSelectedValuesList();
         fillTable(productService.findProductByCategories(catSelect));
*/        
        }else if(rdoCat.isSelected()){
            List<String> seleccionados = listCategories.getSelectedValuesList();
            
            String categories = String.join(",", seleccionados);
            System.out.println("Elementos seleccionados: " + categories);
            
            fillTableCat(productService.findProductsByCategory(categories));
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoIdActionPerformed

    private void rdoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNameActionPerformed

    private void rdoCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCatActionPerformed
    
 
    
    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listCategories;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JRadioButton rdoCat;
    private javax.swing.JRadioButton rdoId;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
