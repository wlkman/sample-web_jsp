package web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTagTest extends TagSupport{
	 private PageContext pageContext;
	 
     @Override
     public void setPageContext(PageContext pageContext) {
        this.pageContext=pageContext;
     }
     
     @Override
     public int doStartTag() throws JspException {
         
	     try {
	         pageContext.getResponse().getWriter().write("<div><h1>Test Jsp Tag</h1><p>first line</p><p>second line</p></div>");
         } catch (IOException e) {
             e.printStackTrace();
             throw new RuntimeException(e);
         }
         return super.doStartTag();
     }
}
