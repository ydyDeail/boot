package org.ydy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Component
public class gatewayfilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
       RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        String token=request.getParameter("token");
        if(token==null||!token.equals("123")){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            HttpServletResponse response=context.getResponse();
            try {
                PrintWriter out=response.getWriter();
                out.print("error!");
            }catch (IOException e){
                e.printStackTrace();

        }}
        return null;
    }
}
