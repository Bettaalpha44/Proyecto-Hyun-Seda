package es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.mapper;

import es.rbailen.sample.hexagonalarchitecture.domain.model.Category;
import es.rbailen.sample.hexagonalarchitecture.domain.model.Category.CategoryBuilder;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.CategoryEntity;
import es.rbailen.sample.hexagonalarchitecture.infrastructure.adapters.output.persistence.entity.CategoryEntity.CategoryEntityBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CategoryPersistenceMapperImpl implements CategoryPersistenceMapper {

    @Override
    public CategoryEntity toCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.categoryId( category.getCategoryId() );
        categoryEntity.name( category.getName() );

        return categoryEntity.build();
    }

    @Override
    public Category toCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryBuilder category = Category.builder();

        category.categoryId( categoryEntity.getCategoryId() );
        category.name( categoryEntity.getName() );

        return category.build();
    }

    @Override
    public List<CategoryEntity> toCategoryEntities(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( categories.size() );
        for ( Category category : categories ) {
            list.add( toCategoryEntity( category ) );
        }

        return list;
    }

    @Override
    public List<Category> toCategories(List<CategoryEntity> categories) {
        if ( categories == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categories.size() );
        for ( CategoryEntity categoryEntity : categories ) {
            list.add( toCategory( categoryEntity ) );
        }

        return list;
    }
}
