package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.Category;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Category.CategoryBuilder;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Product;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Product.ProductBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.CategoryEntity;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.CategoryEntity.CategoryEntityBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.ProductEntity.ProductEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductPersistenceMapperImpl implements ProductPersistenceMapper {

    @Override
    public ProductEntity toProductEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntityBuilder productEntity = ProductEntity.builder();

        productEntity.productId( product.getProductId() );
        productEntity.estado( product.getEstado() );
        productEntity.name( product.getName() );
        productEntity.price( product.getPrice() );
        productEntity.description( product.getDescription() );
        productEntity.slug( product.getSlug() );
        productEntity.stock( product.getStock() );
        productEntity.keywords( product.getKeywords() );
        productEntity.images( product.getImages() );
        productEntity.characteristics( product.getCharacteristics() );
        productEntity.categories( categoryListToCategoryEntityList( product.getCategories() ) );

        return productEntity.build();
    }

    @Override
    public Product toProduct(ProductEntity productEntity) {
        if ( productEntity == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.productId( productEntity.getProductId() );
        product.estado( productEntity.getEstado() );
        product.name( productEntity.getName() );
        product.price( productEntity.getPrice() );
        product.description( productEntity.getDescription() );
        product.slug( productEntity.getSlug() );
        product.stock( productEntity.getStock() );
        product.keywords( productEntity.getKeywords() );
        product.images( productEntity.getImages() );
        product.characteristics( productEntity.getCharacteristics() );
        product.categories( categoryEntityListToCategoryList( productEntity.getCategories() ) );

        return product.build();
    }

    @Override
    public List<ProductEntity> toProductEntities(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductEntity> list = new ArrayList<ProductEntity>( products.size() );
        for ( Product product : products ) {
            list.add( toProductEntity( product ) );
        }

        return list;
    }

    @Override
    public List<Product> toProducts(List<ProductEntity> categories) {
        if ( categories == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( categories.size() );
        for ( ProductEntity productEntity : categories ) {
            list.add( toProduct( productEntity ) );
        }

        return list;
    }

    protected CategoryEntity categoryToCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.categoryId( category.getCategoryId() );
        categoryEntity.name( category.getName() );

        return categoryEntity.build();
    }

    protected List<CategoryEntity> categoryListToCategoryEntityList(List<Category> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryEntity> list1 = new ArrayList<CategoryEntity>( list.size() );
        for ( Category category : list ) {
            list1.add( categoryToCategoryEntity( category ) );
        }

        return list1;
    }

    protected Category categoryEntityToCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryBuilder category = Category.builder();

        category.categoryId( categoryEntity.getCategoryId() );
        category.name( categoryEntity.getName() );

        return category.build();
    }

    protected List<Category> categoryEntityListToCategoryList(List<CategoryEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Category> list1 = new ArrayList<Category>( list.size() );
        for ( CategoryEntity categoryEntity : list ) {
            list1.add( categoryEntityToCategory( categoryEntity ) );
        }

        return list1;
    }
}
