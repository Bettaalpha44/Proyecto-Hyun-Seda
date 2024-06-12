package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.Category;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Category.CategoryBuilder;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Product;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.request.CategoryCreateRequest;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.CategoryCreateResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.CategoryCreateResponse.CategoryCreateResponseBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.CategoryQueryResponse;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.input.rest.data.response.CategoryQueryResponse.CategoryQueryResponseBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CategoryRestMapperImpl implements CategoryRestMapper {

    @Override
    public Category toCategory(CategoryCreateRequest categoryCreateRequest) {
        if ( categoryCreateRequest == null ) {
            return null;
        }

        CategoryBuilder category = Category.builder();

        category.name( categoryCreateRequest.getName() );
        List<Product> list = categoryCreateRequest.getProducts();
        if ( list != null ) {
            category.products( new ArrayList<Product>( list ) );
        }

        return category.build();
    }

    @Override
    public CategoryCreateResponse toCategoryCreateResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryCreateResponseBuilder categoryCreateResponse = CategoryCreateResponse.builder();

        categoryCreateResponse.categoryId( category.getCategoryId() );
        categoryCreateResponse.name( category.getName() );
        List<Product> list = category.getProducts();
        if ( list != null ) {
            categoryCreateResponse.products( new ArrayList<Product>( list ) );
        }

        return categoryCreateResponse.build();
    }

    @Override
    public CategoryQueryResponse toCategoryQueryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryQueryResponseBuilder categoryQueryResponse = CategoryQueryResponse.builder();

        categoryQueryResponse.categoryId( category.getCategoryId() );
        categoryQueryResponse.name( category.getName() );
        List<Product> list = category.getProducts();
        if ( list != null ) {
            categoryQueryResponse.products( new ArrayList<Product>( list ) );
        }

        return categoryQueryResponse.build();
    }

    @Override
    public List<CategoryQueryResponse> toCategoriesQueryResponse(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryQueryResponse> list = new ArrayList<CategoryQueryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( toCategoryQueryResponse( category ) );
        }

        return list;
    }

    @Override
    public CategoryCreateResponse toCategoryUpdateResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryCreateResponseBuilder categoryCreateResponse = CategoryCreateResponse.builder();

        categoryCreateResponse.categoryId( category.getCategoryId() );
        categoryCreateResponse.name( category.getName() );
        List<Product> list = category.getProducts();
        if ( list != null ) {
            categoryCreateResponse.products( new ArrayList<Product>( list ) );
        }

        return categoryCreateResponse.build();
    }
}
