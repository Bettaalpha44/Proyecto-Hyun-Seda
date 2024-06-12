package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.Category;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Product;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Product.ProductBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.ProductCreateRequest;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductCreateResponse.ProductCreateResponseBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.ProductQueryResponse.ProductQueryResponseBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductRestMapperImpl implements ProductRestMapper {

    @Override
    public Product toProduct(ProductCreateRequest productCreateRequest) {
        if ( productCreateRequest == null ) {
            return null;
        }

        ProductBuilder product = Product.builder();

        product.name( productCreateRequest.getName() );
        product.price( productCreateRequest.getPrice() );
        product.description( productCreateRequest.getDescription() );
        product.slug( productCreateRequest.getSlug() );
        product.stock( productCreateRequest.getStock() );
        product.keywords( productCreateRequest.getKeywords() );
        product.images( productCreateRequest.getImages() );
        product.characteristics( productCreateRequest.getCharacteristics() );
        List<Category> list = productCreateRequest.getCategories();
        if ( list != null ) {
            product.categories( new ArrayList<Category>( list ) );
        }

        return product.build();
    }

    @Override
    public ProductCreateResponse toProductCreateResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateResponseBuilder productCreateResponse = ProductCreateResponse.builder();

        productCreateResponse.productId( product.getProductId() );
        productCreateResponse.estado( product.getEstado() );
        productCreateResponse.name( product.getName() );
        productCreateResponse.price( product.getPrice() );
        productCreateResponse.description( product.getDescription() );
        productCreateResponse.slug( product.getSlug() );
        productCreateResponse.stock( product.getStock() );
        productCreateResponse.keywords( product.getKeywords() );
        productCreateResponse.images( product.getImages() );
        productCreateResponse.characteristics( product.getCharacteristics() );
        List<Category> list = product.getCategories();
        if ( list != null ) {
            productCreateResponse.categories( new ArrayList<Category>( list ) );
        }

        return productCreateResponse.build();
    }

    @Override
    public ProductQueryResponse toProductQueryResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductQueryResponseBuilder productQueryResponse = ProductQueryResponse.builder();

        productQueryResponse.productId( product.getProductId() );
        productQueryResponse.estado( product.getEstado() );
        productQueryResponse.name( product.getName() );
        productQueryResponse.price( product.getPrice() );
        productQueryResponse.description( product.getDescription() );
        productQueryResponse.slug( product.getSlug() );
        productQueryResponse.stock( product.getStock() );
        productQueryResponse.keywords( product.getKeywords() );
        productQueryResponse.images( product.getImages() );
        productQueryResponse.characteristics( product.getCharacteristics() );
        List<Category> list = product.getCategories();
        if ( list != null ) {
            productQueryResponse.categories( new ArrayList<Category>( list ) );
        }

        return productQueryResponse.build();
    }

    @Override
    public List<ProductQueryResponse> toProductsQueryResponse(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductQueryResponse> list = new ArrayList<ProductQueryResponse>( products.size() );
        for ( Product product : products ) {
            list.add( toProductQueryResponse( product ) );
        }

        return list;
    }

    @Override
    public ProductCreateResponse toProductUpdateResponse(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateResponseBuilder productCreateResponse = ProductCreateResponse.builder();

        productCreateResponse.productId( product.getProductId() );
        productCreateResponse.estado( product.getEstado() );
        productCreateResponse.name( product.getName() );
        productCreateResponse.price( product.getPrice() );
        productCreateResponse.description( product.getDescription() );
        productCreateResponse.slug( product.getSlug() );
        productCreateResponse.stock( product.getStock() );
        productCreateResponse.keywords( product.getKeywords() );
        productCreateResponse.images( product.getImages() );
        productCreateResponse.characteristics( product.getCharacteristics() );
        List<Category> list = product.getCategories();
        if ( list != null ) {
            productCreateResponse.categories( new ArrayList<Category>( list ) );
        }

        return productCreateResponse.build();
    }
}
