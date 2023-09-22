package com.gentech.methods;


		class demo1
		{
		 int isprime1(int x)
		{
			int flag=1;
			int sum=0;
			for(int i=100;i<=200;i++)
			{
				for(int j=2;j<=i;j++)
				{
					if(i%j==0)
					{
						flag=flag+1;
						break;
					}
				}
				if(flag==1)
				{
					sum=sum+1;
				}
		
			}
			return x;
		}
			
		}
		
		public class demo {

			public static void main(String[] args) {
				demo1 o=new demo1();
				int v1=o.isprime1(2);
				System.out.println(v1);
				

			}

		}


