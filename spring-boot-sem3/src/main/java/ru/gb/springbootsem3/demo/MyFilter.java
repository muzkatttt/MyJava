package ru.gb.springbootsem3.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

//@Component
public class MyFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(MyFilter.class);

    public MyFilter() {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, ServletException {
        if (servletRequest instanceof HttpServletRequest httpServletRequest) {
            String uri = httpServletRequest.getRequestURI();
            log.info("Входящий запрос: {}", uri);
            if (uri.startsWith("/admin")) {
                ((HttpServletResponse)servletResponse).sendError(403);
            } else {
                filterChain.doFilter(servletRequest, servletResponse);
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }
}
