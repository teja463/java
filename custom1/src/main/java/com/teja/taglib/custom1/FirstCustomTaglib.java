package com.teja.taglib.custom1;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FirstCustomTaglib extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int doStartTag(){
		JspWriter out = pageContext.getOut();
		try {
			out.print(new Date());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return TagSupport.SKIP_BODY;
	}
}
