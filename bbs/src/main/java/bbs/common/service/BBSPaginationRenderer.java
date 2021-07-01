package bbs.common.service;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

import egovframework.rte.ptl.mvc.tags.ui.pagination.AbstractPaginationRenderer;

public class BBSPaginationRenderer extends AbstractPaginationRenderer implements ServletContextAware {

	ServletContext servletContext;
	
	public void initVariables(){

		firstPageLabel    = "<a title=\"맨 처음 페이지\" class=\"ago_prev\" href=\"?pageIndex={1}\" onclick=\"{0}({1});return false; \"><image src=\"../images/bbs/ago_prev.png\" border=0/></a>";
        previousPageLabel = "<a class=\"prev\" href=\"?pageIndex={1}\" onclick=\"{0}({1});return false; \"><image src=\"../images/bbs/prev.png\" border=0/></a>";
        currentPageLabel  = "<a href=\"#\" class=\"on\">{0}</a>&nbsp;";
        otherPageLabel    = "<a href=\"?pageIndex={1}\" onclick=\"{0}({1});return false; \">{2}</a>&nbsp";
        nextPageLabel     = "<a class=\"next\" href=\"?pageIndex={1}\" onclick=\"{0}({1});return false; \"><image src=\"../images/bbs/next.png\" border=0/></a>";
        lastPageLabel     = "<a class=\"ago_next\" href=\"?pageIndex={1}\" onclick=\"{0}({1});return false; \"><image src=\"../images/bbs/ago_next.png\" border=0/></a>";

	}



	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
		initVariables();
	}

}
