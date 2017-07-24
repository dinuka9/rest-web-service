package lk.dinuka.service;

import org.springframework.stereotype.Service;

/**
 * Created by dinuka on 7/24/17.
 */
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

    public ExampleModel get(int id) {
        return new ExampleModel("example model", 1000+id);
    }
}
