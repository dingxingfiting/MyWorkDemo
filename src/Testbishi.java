

    class SanJaasXingu
    {
        public static void main(String[] args)
        {
            for (int i=0;i<5 ;i++ )
            {
                //输出空格随着循环是递减的
                for (int j=0;j<=5-i ;j++ )
                {
                    System.out.print(" ");
                }
                //输出*号随着外循环是递增的,当k<=i时 只打印三角形的一半,首先k是从0开始的
                for (int k=0;k<=i*2 ;k++ )
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

