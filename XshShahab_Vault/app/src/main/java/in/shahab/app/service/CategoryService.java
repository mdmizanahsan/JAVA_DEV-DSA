package in.shahab.app.service;

import in.shahab.app.io.CategoryRequest;
import in.shahab.app.io.CategoryResponse;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

}
