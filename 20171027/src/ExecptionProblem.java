public class ExecptionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30};
		try
		{
			for(int i=0;i<=3;i++) {
				System.out.println("ar["+i+"]:"+ar[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
	}

}
