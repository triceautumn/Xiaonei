//�������ǵ�һ��js ������

function changeStatus(obj){
  		if(obj.value=='worker'){
  			$(".gra_spe").css("display","none");
			$(".worker_sep").css("display","block");
  		}else if(obj.value=='graduate'){
  			//jquery����classȥѰ�ҿؼ�����.
  			$(".gra_spe").css("display","block");
			$(".worker_sep").css("display","none");
  		}
}


