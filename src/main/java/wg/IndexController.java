package wg;

import ninja.Result;
import ninja.Results;
import ninja.params.Param;

import javax.inject.Singleton;

@Singleton
public class IndexController {

    public Result index() {
        return Results.html();
    }

    public Result login() {
        return Results.html();
    }


    public Result loginWithParam(@Param("userName") String userName,
                                 @Param("pwd") String pwd) {
        return Results.html()
                .template("wg/indexController/index.ftl.html");
    }

}

