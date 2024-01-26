<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    

<div id="board_wrap">
	<h3>내 코드를 도와줘!</h3>
	<div class="moveBt">
		<a href="/board_writePage.do">도움받기</a>
		<div class="sortList">
			<a href="javascript:sortTitle()">
				제목 
				<i class="bi bi-arrow-down"></i>
				<i class="bi bi-arrow-up iconHide"></i>
			</a>
			<a href="javascript:sortDate()">
				날짜
				<i class="bi bi-arrow-down"></i>
				<i class="bi bi-arrow-up iconHide"></i>
			</a>
			<a href="javascript:sortHit()">
				조회수
				<i class="bi bi-arrow-down"></i>
				<i class="bi bi-arrow-up iconHide"></i>
			</a>
		</div>
	</div>
	
	<div id="search_wrap">
		<div class="search_box">
			<b>검색</b>
			<input type="text" name="keyword" id="keyword" placeholder="제목 또는 내용 검색">
			<i class="bi bi-search"></i>
		</div>
	</div>
	
	<div id="list_wrap">
		<table class="list_table">
			<thead>
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="date">작성일</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
			</thead>
			
			<tbody>
			
				<tr>
					<td class="noneWrite" colspan="5"> 등록된 글이 없습니다.</td>
				</tr>
				
				<tr>
					<td class="num numtd"></td>
					<td class="title titletd"></td>
					<td class="date datetd"></td>
					<td class="writer writertd"></td>
					<td class="hit hittd"></td>
				</tr>
			</tbody>
			
			<tfoot>
				<tr>
					<td colspan="5">
						<i class="bi bi-arrow-left-circle"></i>
						
						
						<i class="bi bi-arrow-right-circle"></i>
					</td>
				</tr>
				
			</tfoot>
			
		</table>
	</div>
	
</div>




