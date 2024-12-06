package kr.smhrd.config;

public class ViewResolver {
    public static String makeURL(String view){
        return "/WEB-INF/views/"+view+".jsp";
    }
}
