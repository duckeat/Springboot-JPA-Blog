let index = {
	init: function(){
		$("#btn-save").on("click", ()=>{ // function(){} -> ()=>{}는 this를 바인딩하기 위함
			this.save();
		});
		$("#btn-login").on("click", ()=>{
		    this.login();
		})
	},
	save: function(){
		//alert("user의 save함수 호출됨");
		let data = {
		    username: $("#username").val(),
		    password: $("#password").val(),
		    email: $("#email").val()
		};
		//console.log(data);
		// ajax는 기본은 비동기임

		$.ajax({
		    type: "POST",
		    url: "/blog/api/user",
		    data: JSON.stringify(data),
		    contentType: "application/json; charset=utf-8",
		    dataType: "json"
		}).done(function(resp){
            alert("회원 가입이 완료되었습니다.");
            console.log(resp);
            location.href = "/blog";
		}).fail(function(error){
		    alert(JSON.stringify(error));
		});

		// ajax 통신을 이용하여 3개의 데이터를 json으로 변경하여 insert 요청!
	},
	login: function() {
	    let data = {
        	username: $("#username").val(),
        	password: $("#password").val()
        };
        $.ajax({
                type: "POST",
        	    url: "/blog/api/user/login",
        	    data: JSON.stringify(data),
        	    contentType: "application/json; charset=utf-8",
        	    dataType: "json"
            }).done(function(resp){
                alert("회원 가입이 완료되었습니다.");
                console.log(resp);
                location.href = "/blog";
        }).fail(function(error){
        alert(JSON.stringify(error));
        });
	}
}
index.init();