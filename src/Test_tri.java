import java.util.Scanner;

public class Test_tri
    {
        //TRi INSERTION
        public static int[] tri_insertion (int tab[])
        {
            int i,j,cle;
            for(i=1;i<tab.length;i++)
            {
                cle=tab[i];
                j=i;
                while(j>=1 && tab[j-1]>cle)
                {
                    tab[j]=tab[j-1];
                    j=j-1;
                }
                tab[j]=cle;
            }
            return tab;
        }

        //TRi BULLE
        public static int[] tri_bulle_croissan(int tableau[])
        {
            int longueur=tableau.length;
            int cle;
            boolean inversion;
            do
            {
                inversion=false;
                for(int i=0;i<longueur-1;i++)
                {
                    if(tableau[i]>tableau[i+1])
                    {
                        cle=tableau[i];
                        tableau[i]=tableau[i+1];
                        tableau[i+1]=cle;
                        inversion=true;
                    }
                }
            } while(inversion);
            return tableau;
        }

        public static int[] tri_bulle_decroissan(int tab[])
        {
            int longueur = tab.length;
            int cle;
            boolean inversion;
            do {
                inversion = false;
                for (int i = 0; i < longueur - 1; i++) {
                    if (tab[i] < tab[i + 1]) {
                        cle = tab[i+1];
                        tab[i+1] = tab[i ];
                        tab[i] = cle;
                        inversion = true;
                    }
                }
            } while (inversion);

            return tab;

        }
        //TRi FUSION
        public static int[] tri_fusion(int[] A)
        {
            if (A.length < 2)
                return A;
            int milieu = A.length/2;
            int[] tab1 = new int[milieu];
            int[] tab2 = new int[A.length - milieu];

            for (int i = 0; i < milieu; i++)
                tab1[i]= A[i];
            for (int i = milieu; i < A.length; i++)
                tab2[i - milieu]= A[i];

            tri_fusion(tab1);
            tri_fusion(tab2);

            fussioner(A, tab1, tab2, milieu, A.length - milieu);
            return A;
        }

        public static void fussioner(int[] A, int[] tab1, int[] tab2, int left, int right)
        {
            int i = 0, j = 0, k = 0;
            while (i < left && j < right)
            {
                if (tab1[i]<= tab2[j])
                    A[k++]= tab1[i++];
                else
                    A[k++]= tab2[j++];
            }
            while (i < left)
                A[k++]= tab1[i++];
            while (j < right)
                A[k++]= tab2[j++];

        }
        public static void  Recherche( int tableau[])
        {
            int x;

            int longueur = tableau.length;
            int i=0, j=0;

            for (i=0;i<longueur+1;i++)
            {
                System.out.println("Quel nombre recherchez-vous ?");
                Scanner clavier= new Scanner(System.in);
                int k= clavier.nextInt();
             if (tableau[i]==k)
             {
                 System.out.println("C nombre est a l'index " +tableau[i]+"  dans le tableau tri?? ordre croissant");
             }else {
                 System.out.println("Le nombre est introuvable");
             }
            }
        }

    }


