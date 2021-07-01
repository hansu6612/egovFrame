/*========================================================================

	----------------------------------------------------------------------
	* Date		:	
	* Name		:	
	----------------------------------------------------------------------
	
	- Description -
	01. 

========================================================================*/


$(function(){
    

    /* 본문 바로가기 스크립트 */
    $(document).ready(function() {
        $('.skip a').on('focus', function(){
            $(this).stop().animate({"top":0, "opacity":1});
        });
        $('.skip a').on('click', function(){
            $(this).stop().animate({"top":"-48px", "opacity":0});
        });
        $('.skip a').on('focusout', function(){
            $(this).stop().animate({"top":"-48px", "opacity":0});
        });
    });

    /* 탭키로 탑메뉴에 포커스 이동 시 메뉴 처리 스크립트 */
    $(document).ready(function() {
        $('.gnb a').on('focus', function(){
            $('.lnb').stop(true).slideDown(300);
        });

        $('.gnb a').on('focusout', function(){
            $('.lnb').stop(true).slideUp(300);
        });
    });

    
    /* 약관 */
    $(document).ready(function() {
        $('.btn_clause1').on('click', function(){
            $('.clause_wrap').css({display:'block'});
            $('.clause_box1').css({display:'block'});
            
            $('body').css({overflowY:'hidden'});
        });
        $('.btn_clause2').on('click', function(){
            $('.clause_wrap').css({display:'block'});
            $('.clause_box2').css({display:'block'});
            
            $('body').css({overflowY:'hidden'});
        });
        
        $('.clause_close').on('click', function(){
            $('.clause_wrap').css({display:'none'});
            $('.clause_box1').css({display:'none'});
            $('.clause_box2').css({display:'none'});
            
            $('body').css({overflowY:'scroll'});
        });
    });
    
    /* 기관기업 검색 */
    $(document).ready(function() {
        $('.btn_companySearch').on('click', function(){
            $('.companySearch_wrap').css({display:'block'});
            
            $('body').css({overflowY:'hidden'});
        });
        
        $('.companySearch_close').on('click', function(){
            $('.companySearch_wrap').css({display:'none'});
            
            $('body').css({overflowY:'scroll'});
        });
    });
    
    /* 기관기업 등록 */
    $(document).ready(function() {
        $('.add').on('click', function(){
            $('.companyRegist_wrap').css({display:'block'});
            
            $('body').css({overflowY:'hidden'});
        });
        
        $('.companyRegist_close').on('click', function(){
            $('.companyRegist_wrap').css({display:'none'});
            
            $('body').css({overflowY:'scroll'});
        });
    });
    
    
    /* 기관기업 검색 */
    $(document).ready(function() {
        $('.reservation_btn').on('click', function(){
            $('.reservation_wrap').css({display:'block'});
            
            $('body').css({overflowY:'hidden'});
        });
        
        $('.reservation_close').on('click', function(){
            $('.reservation_wrap').css({display:'none'});
            
            $('body').css({overflowY:'scroll'});
        });
    });


});

