package conf;

import ninja.Router;
import ninja.application.ApplicationRoutes;
import wg.IndexController;

public class Routes implements ApplicationRoutes {
    @Override
    public void init(Router router) {
        router.GET().route("/").with(IndexController::index);
        router.GET().route("/toLogin").with(IndexController::login);
        router.GET().route("/login").with(IndexController::loginWithParam);
//        router.POST().route("/login").with(IndexController::login);
    }
}
