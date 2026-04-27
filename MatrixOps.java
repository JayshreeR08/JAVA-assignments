class MatrixOps {
    int[][] a = {{1,2},{3,4}};
    int[][] b = {{5,6},{7,8}};

    void addition() {
        int[][] c = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transpose() {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
