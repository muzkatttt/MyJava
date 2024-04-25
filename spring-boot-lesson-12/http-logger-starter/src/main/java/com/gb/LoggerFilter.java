package com.gb;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class LoggerFilter implements Filter {

    private final LoggingProperties loggingProperties;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        log.atLevel(loggingProperties.getLogLevel()).log("request: {}", httpServletRequest.getServletPath());

        filterChain.doFilter(servletRequest, servletResponse);

        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        log.atLevel(loggingProperties.getLogLevel()).log("response: url:{}, status: {}", httpServletRequest.getServletPath(), httpServletResponse.getStatus());
    }
}
