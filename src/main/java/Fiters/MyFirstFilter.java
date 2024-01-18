package Fiters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("This is message from filter 1");
        chain.doFilter(request,response);
    }
}
