package org.hhs.pro.servlet;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.hhs.pro.baseInters.BaseService;
import org.hhs.pro.impls.BaseServiceImpl;
import org.hhs.pro.util.JsonResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "provider", urlPatterns = "/provider.do")
public class providerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String serviceName = req.getParameter("service");
        String format = req.getParameter("format");
        Map paramters = req.getParameterMap();
        BaseService service = new BaseServiceImpl();
        Object result = service.execcute(paramters);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(result);
        jsonResult.setMessage("success");
        jsonResult.setResultCode(200);
        String json = JSON.toJSONString(jsonResult);
        resp.getWriter().write(json);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
