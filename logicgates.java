//how to pass n arguments
class logicgates{
	

	int or_gate(int int1,int int2){
	int a,b;
	a=inp1;
	b=inp2;
	int ans;
	
	int or_ans;
	
	//using the | operator
	or_ans = a|b;
	return or_ans;
	}
	int nor_gate(int int1,int int2){
	int nor_ans;
	int a=inp1;
	int b=inp2;
	
	if(a==0 && b==0)
	out_not=1;
	else
	out_not=0;
	return out_nor;
		
		
	}
	public static void main(String args[]){
	int inp1=0;
	int inp2=0;
	logicgates lg = new logicgates();
	int result_or=lg.or_gate(inp1,inp2);
	int result_nor=lg.nor_gate(inp1,inp2);
	
	System.out.println("result_or:"+result_or);
	System.out.println("result_nor:"+result_nor);
	}
}