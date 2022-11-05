package com.apstore.api.pos.apstoreposapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.apstore.api.pos.apstoreposapi.service.CategoryManager;
import com.apstore.api.pos.apstoreposapi.vo.FetchCategoryRes;

@RestController
@RequestMapping("/api/pos")
public class CommonController extends BaseController {
    
    private CategoryManager cateService;

    @GetMapping(value = "/categories",produces = MediaType.APPLICATION_JSON_VALUE)
    //@CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<FetchCategoryRes> fetchAllCategories(){
        FetchCategoryRes res = new FetchCategoryRes();
        res.setCategories(cateService.fetchAll());

        return new ResponseEntity<FetchCategoryRes>(res,HttpStatus.OK);
    }
}
