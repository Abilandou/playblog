$(document).ready(function(){
    $("input#delete-record").click(function(){
    	if(confirm("Sure to Delete Record? You will not be able to recover it again")){
    		return true;
    	}else {
    		return false;
    	}
    })
});