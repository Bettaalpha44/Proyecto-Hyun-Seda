/*
Cosas por hacer:
- implementar la eliminacion de un producto
*/

package co.com.hyunseda.market.presentation;

//import co.com.hyunseda.market.market.Category;
//import co.com.hyunseda.market.market.Product;
import com.unicauca.clientproducthttpclient.access.CategoryRestRepository;
//import co.com.hyunseda.market.service.CategoryService;
import com.unicauca.clientproducthttpclient.access.ProductRestRepository;
import com.unicauca.clientproducthttpclient.domain.entities.Category;
import com.unicauca.clientproducthttpclient.domain.entities.Product;
import com.unicauca.clientproducthttpclient.domain.services.CategoryService;
import com.unicauca.clientproducthttpclient.domain.services.ProductService;
import java.awt.Dimension;
//import co.com.hyunseda.market.service.ProductService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class GUIProducts extends javax.swing.JFrame {
    DefaultListModel<String> model = new DefaultListModel<>();
  //  private ProductService productService;
    //private CategoryService categoryService;
    private boolean addOption;
    
    /**
     * Creates new form GUIProducts
     */
    //servicio para comunicarnos con el microservicio producto.
    ProductService service = new ProductService(new ProductRestRepository());
    CategoryService serviceC = new CategoryService(new CategoryRestRepository());
    
    public GUIProducts() {
        initComponents();
        stateInitial();
        initCats();
        listCategories.setModel(model);
        // Crea un JScrollPane y pásale tu JList como argumento
    JScrollPane scrollPane = new JScrollPane(listCategories);
//scrollPane.setMinimumSize(new Dimension(100, 100)); // Establece el tamaño mínimo a 100x100 píxeles

// Agrega el JScrollPane a tu contenedor (por ejemplo, un JPanel)
    pnlCenter.add(scrollPane);

         
    }
    //Aqui recivia CategoryService categoryService, ProductService productService
    public GUIProducts(CategoryService categoryService, ProductService productService) {
        initComponents();
       // this.productService = productService;
    //    this.categoryService = categoryService;
        stateInitial();
       // initCats();
    }
    
    
    public void initCats(){
   
     //List<Category> result = serviceC.findAll();

       List<Category> cats = serviceC.findAll();
        
   /*     for(Category cat : cats){
            System.out.println(cat.getName());
            model.addElement(cat.getName());
        }
        */
        
        for (int i = 0; i < cats.size(); i++) {
           System.out.println(cats.get(i).getName());
            model.addElement(cats.get(i).getName());  
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

        pnlSouth = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextArea();
        lbSlug = new javax.swing.JLabel();
        txtSlug = new javax.swing.JTextField();
        lbPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lbStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lbKeywords = new javax.swing.JLabel();
        txtKeywords = new javax.swing.JTextField();
        lbCaracteristicas = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JTextField();
        lbImages = new javax.swing.JLabel();
        txtImages = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        listCategories = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        pnlSouth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlSouth.add(btnNuevo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEditar);

        btnSave.setText("Grabar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlSouth.add(btnSave);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCancelar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEliminar);

        btnFind.setText("Buscar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        pnlSouth.add(btnFind);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCerrar);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarElimActionPerformed(evt);
            }
        });
        pnlSouth.add(btnConfirmar);

        btnEditar2.setText("Editar Producto");
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEditar2);

        getContentPane().add(pnlSouth, java.awt.BorderLayout.SOUTH);

        pnlCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlCenter.setLayout(new java.awt.GridLayout(10, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("*Id:");
        pnlCenter.add(jLabel1);

        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        pnlCenter.add(txtId);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("*Nombre:");
        pnlCenter.add(jLabel2);

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        pnlCenter.add(txtName);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción:");
        pnlCenter.add(jLabel3);

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        pnlCenter.add(txtDescription);

        lbSlug.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSlug.setText("*Slug:");
        pnlCenter.add(lbSlug);
        pnlCenter.add(txtSlug);

        lbPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPrice.setText("*Precio:");
        pnlCenter.add(lbPrice);
        pnlCenter.add(txtPrice);

        lbStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbStock.setText("*Stock:");
        pnlCenter.add(lbStock);
        pnlCenter.add(txtStock);

        lbKeywords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbKeywords.setText("Palabras clave:");
        pnlCenter.add(lbKeywords);
        pnlCenter.add(txtKeywords);

        lbCaracteristicas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCaracteristicas.setText("Caracteristicas:");
        pnlCenter.add(lbCaracteristicas);
        pnlCenter.add(txtCaracteristicas);

        lbImages.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbImages.setText("*Imagenes");
        pnlCenter.add(lbImages);
        pnlCenter.add(txtImages);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Categoria(s):");
        pnlCenter.add(jLabel4);

        pnlCenter.add(listCategories);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        stateNew();
        txtName.requestFocus();
        addOption = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        stateInitial();
        cleanControls();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        if (addOption) {
            if (txtName.getText().trim().equals("")) {
                Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
                txtName.requestFocus();
                return;
            }
            //Agregar
            addProduct();

        } else {
            
            try{
                Long productId = Long.parseLong(txtId.getText());
               
                Product prod = service.findById(productId);
                if (prod != null) {
                    if (txtName.getText().trim().equals("")) {
                        Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
                        txtName.requestFocus();
                        return;
                    }
                }
                
            }catch(NumberFormatException e){
                
            }
            //Editar
            //editProduct();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        addOption = false;
        stateEdit();
        txtId.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        stateElim();
        txtId.requestFocus();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
      GUIProductsFind instance = new GUIProductsFind(this, true, service, serviceC);
       instance.setVisible(true);
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
       
        if (txtId.getText().trim().equals("")) {
            return;
        }
        try{
            Long productId = Long.parseLong(txtId.getText());
            System.out.println("Entra al txtidfocuslost\n");
           Product prod = service.findById(productId);
            if (prod == null) {
                Messages.showMessageDialog("El identificador del producto no existe", "Error");
                txtId.setText("");
                txtId.requestFocus();
            } else {
                txtName.setEnabled(true);
                txtDescription.setEnabled(true);
                txtName.setText(prod.getName());
                txtDescription.setText(prod.getDescription());
                txtSlug.setText(prod.getSlug());
                txtPrice.setText(String.valueOf(prod.getPrice()));
                txtStock.setText(String.valueOf(prod.getStock()));
                txtKeywords.setText(prod.getKeywords());
                txtCaracteristicas.setText(prod.getCharacteristics());
                txtImages.setText(prod.getImages());
                
            }
        }catch(NumberFormatException e){
            Messages.showMessageDialog("Se esperaba un numero en la casilla de la id", "Error");
            txtId.setText("");
            txtId.requestFocus();
        }

         
    }//GEN-LAST:event_txtIdFocusLost

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusLost

    private void btnConfirmarElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarElimActionPerformed
        // TODO add your handling code here:
        
        String id = txtId.getText().trim();
        if (id.equals("")) {
            Messages.showMessageDialog("Debe buscar el producto a eliminar", "Atención");
            txtId.requestFocus();
            return;
        }
        try{
            Long productId = Long.parseLong(id);
            Product prod = service.findById(productId);
            if (prod != null) {
                if (Messages.showConfirmDialog("Está seguro que desea eliminar este producto?", "Confirmación") == JOptionPane.YES_NO_OPTION) {
                    service.delete(productId);
                    cleanControls();
                    /*if (service.delete(productId)) {
                        Messages.showMessageDialog("Producto eliminado con éxito", "Atención");
                        stateInitial();
                        cleanControls();
                    }*/
                }
            }
        }catch(NumberFormatException e){
            
        }

        
    }//GEN-LAST:event_btnConfirmarElimActionPerformed

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
       
        editProduct();
        System.out.println("probando metodo editar producto");
    }//GEN-LAST:event_btnEditar2ActionPerformed
    private void stateEdit() {
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(false);
        btnFind.setVisible(false);
        txtId.setEnabled(true);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);
        txtCaracteristicas.setEnabled(true);
        txtSlug.setEnabled(true);
        txtPrice.setEnabled(true);
        txtStock.setEnabled(true);
        txtKeywords.setEnabled(true);
        txtCaracteristicas.setEnabled(true);
        txtImages.setEnabled(true);
        listCategories.setEnabled(true);
        btnEditar2.setVisible(true);
    }

    private void stateInitial() {
        btnEditar2.setVisible(false);
        btnNuevo.setVisible(true);
        btnEditar.setVisible(true);
        btnEliminar.setVisible(true);
        btnCancelar.setVisible(false);
        btnCerrar.setVisible(true);
        btnSave.setVisible(false);
        btnFind.setVisible(true);
        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtDescription.setEnabled(false);
        
        btnConfirmar.setVisible(false);
        txtId.setVisible(true);
        txtName.setVisible(true);
        txtDescription.setVisible(true);
        listCategories.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);

    }
    
    private void stateElim() {
        btnEditar2.setVisible(false);
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(false);
        btnFind.setVisible(false);
        btnConfirmar.setVisible(true);
        txtId.setVisible(true);
        txtName.setVisible(false);
        txtDescription.setVisible(false);
        txtCaracteristicas.setVisible(false);
        txtImages.setVisible(false);
        txtKeywords.setVisible(false);
        txtPrice.setVisible(false);
        txtSlug.setVisible(false);
        txtStock.setVisible(false);
        listCategories.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        txtId.setEnabled(true);
        txtName.setEnabled(false);
        txtDescription.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbImages;
    private javax.swing.JLabel lbKeywords;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSlug;
    private javax.swing.JLabel lbStock;
    private javax.swing.JList<String> listCategories;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImages;
    private javax.swing.JTextField txtKeywords;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSlug;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    
    
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
            java.util.logging.Logger.getLogger(GuioSuperAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuioSuperAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuioSuperAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuioSuperAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIProducts().setVisible(true);
            }
        });
    }
    
    private void stateNew() {
        btnEditar2.setVisible(false);
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(true);
        btnFind.setVisible(false);
        txtId.setEnabled(false);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);

    }

    private void cleanControls() {
        txtId.setText("");
        txtName.setText("");
        txtDescription.setText("");
        txtCaracteristicas.setText("");
        txtImages.setText("");
        txtKeywords.setText("");
        txtPrice.setText("");
        txtStock.setText("");
        txtSlug.setText("");
    }

    private void addProduct() {
        //vamos a crear un producto y mandarlo al servidor de producto.
        
        String name = txtName.getText().trim();
        String description = txtDescription.getText();
        String slug = txtSlug.getText().trim();
        double price = Double.parseDouble( txtPrice.getText().trim());
        int stock = Integer.parseInt(txtStock.getText().trim());
        String keywords = txtKeywords.getText().trim();
        String images = txtImages.getText().trim();
        String characteristics = txtCaracteristicas.getText().trim();
        
        //aqui nesecitamos recuperar la listas que hay en el microservicio Producto.
       
        
            // Obtener los índices de los elementos seleccionados en el JList
    int[] selectedIndices = listCategories.getSelectedIndices();
    List<Category> result = serviceC.findAll();
// Crear una lista para almacenar las categorías seleccionadas
    List<Category> selectedCategories = new ArrayList<>();

// Obtener los objetos Category correspondientes a los índices seleccionados
    for (int index : selectedIndices) {
        System.out.println("categoria selecionada: "+index);
        System.out.println(result.get(index).getName());
        Category selectedCategory = result.get(index); // Suponiendo que 'cats' es la lista de categorías
        selectedCategories.add(selectedCategory); // Agregar la categoría seleccionada a la lista
    }
    
    
    // creamos el produco y lo mandamos al servidor
    // Obtener la fecha y hora actuales

 Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setImages(images);
        product.setCharacteristics(characteristics);
        product.setSlug(slug);
        product.setStock(stock);
        product.setKeywords(keywords);
        product.setCategories(selectedCategories);
        
  
    
 //Product producto = new Product(name, price, images, description, slug, stock, keywords, characteristics,result,currentDate);
    service.create(product);
    

// Ahora 'selectedCategories' contiene todas las categorías seleccionadas

       //  InitializeTable();
     //   List<Category> result = serviceC.findAll();
        
      //  this.InitializeTable();
     /* 
        DefaultTableModel model = (        List<Category> result = serviceC.findAll();
            DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[8];//No columnas
        for (int i = 0; i < result.size(); i++) {
            rowData[0] = result.get(i).getId();
            rowData[1] = result.get(i).getName();
            rowData[2] = "" + result.get(i).getPrice();

            model.addRow(rowData);
        }
        
        */
        
        
        List<String> catSelect = listCategories.getSelectedValuesList();
        System.out.println("Pslug:"+ slug);
        System.out.println("PPrice:"+ price);
        System.out.println("Pstock:"+ stock);
        
        
        int m = catSelect.size();
        System.out.println("size de cat selec por el usuario: " + m);
       // List<Category> lcats = categoryService.findAllCategories();
        List<Category> cats = new ArrayList<Category>();
        
        /*
        for(String strselected : catSelect){
            for(Category cat : lcats){
                System.out.println(cat.getName()+" "+strselected);
                if(cat.getName().equals(strselected)){
                    cats.add(cat);
                }
            }
        }*/
        System.out.println("categorias de un producto a aniadir:");
        for(Category cat : cats){
            System.out.println(cat.getName());
        }
        /*
        if (productService.saveProduct(name, description, slug, price, stock, keywords, images, characteristics, cats)) {
            Messages.showMessageDialog("Se grabó con éxito", "Atención");
            cleanControls();
            stateInitial();
        } else {
            Messages.showMessageDialog("Error al grabar, lo siento mucho", "Atención");
        }
            */
    }

    private void editProduct() {
        
        String id = txtId.getText().trim();
        if (id.equals("")) {
            Messages.showMessageDialog("Debe buscar el producto a editar", "Atención");
            txtId.requestFocus();
            return;
        }
        try {
            Long productId = Long.parseLong(id);
            Product prod = new Product();
            prod.setName(txtName.getText().trim());
            prod.setDescription(txtDescription.getText().trim());
            prod.setSlug(txtSlug.getText().trim());
            prod.setPrice(Double.parseDouble(txtPrice.getText().trim()));
            prod.setStock(Integer.parseInt(txtStock.getText().trim()));
            prod.setKeywords(txtKeywords.getText().trim());
            prod.setCharacteristics(txtCaracteristicas.getText().trim());
            prod.setImages(txtImages.getText().trim());
            // Obtener los índices de los elementos seleccionados en el JList
            int[] selectedIndices = listCategories.getSelectedIndices();
            List<Category> result = serviceC.findAll();
// Crear una lista para almacenar las categorías seleccionadas
            List<Category> selectedCategories = new ArrayList<>();

// Obtener los objetos Category correspondientes a los índices seleccionados
            for (int index : selectedIndices) {
                System.out.println("categoria selecionada: " + index);
                System.out.println(result.get(index).getName());
                Category selectedCategory = result.get(index); // Suponiendo que 'cats' es la lista de categorías
                selectedCategories.add(selectedCategory); // Agregar la categoría seleccionada a la lista
            }

            //ACTUALIZANDO CATEGORIAS
            
            prod.setCategories(selectedCategories);
            System.out.println("precio"+prod.getPrice()+"imagen"+prod.getImages());
            cleanControls();
            
            //actualizando productos
            
            service.edit(productId, prod);
            //Messages.showMessageDialog("Se editó con éxito", "Atención");
    // creamos el produco y lo mandamos al servidor
    // Obtener la fecha y hora actuales


/*
            if (productService.editProduct(productId, prod)) {
                Messages.showMessageDialog("Se editó con éxito", "Atención");
                cleanControls();
                stateInitial();
            } else {
                Messages.showMessageDialog("Error al editar, lo siento mucho", "Atención");
            }*/
        }catch(NumberFormatException e){
            
        }
            
    }

}
