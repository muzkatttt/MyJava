package com.gb;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;


import java.io.IOException;

@Slf4j
public class StubLoggerFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Заглушка");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
