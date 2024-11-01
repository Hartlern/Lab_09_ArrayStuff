import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        int[] dataPoints = new int[ 100 ];
        Random random = new Random();


        for( int i = 0; i < dataPoints.length; i++ )
        {
            dataPoints[ i ] = random.nextInt( 100 ) + 1; // Generates a random value between 1 and 100
        }

        //complex for statement thingy
        for( int value : dataPoints )
        {
            System.out.print( value + " | " );
        }
        int sum = 0;
        for( int e = 0; e < dataPoints.length; e++ )
        {
            sum = sum + dataPoints[ e ];
        }
        int ave = sum / dataPoints.length;
        System.out.println( "\n\nThe average of the random array dataPoints is:" + ave );


        Scanner scan = new Scanner( System.in );
        int searchTarget = SafeInput.getRangedInt( scan, "Declare your search target", 0, 100 );

        boolean foundTarget = false;
        for( int e = 0; e < dataPoints.length; e++ )
        {
            if( dataPoints[ e ] == searchTarget )
            {
                foundTarget = true;
                System.out.println( "Found the target " + searchTarget + " in position " + e );
            }
        }


        if( !foundTarget )
        {
            for( int e = 0; e < dataPoints.length; e++ )
            {
                if( dataPoints[ e ] == searchTarget )
                {
                    foundTarget = true;
                    System.out.println( "Found the target(break) " + searchTarget + " in position " + e );
                    break;
                    //this doesnt work unless loop above is commented!!
                }
            }
        }
        if( !foundTarget )
        {

            System.out.println( "Target " + searchTarget + " not Found" );
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for( int e = 0; e < dataPoints.length; e++ )
        {
            if( min > dataPoints[e] )
            {
                min = dataPoints[e];
            }
            if( max < dataPoints[e] )
            {
                max = dataPoints[e];
            }
        }
        System.out.println("minimum: " + min + " . Maximum: " + max);


        double[] dataPoints2 = {10.5, 20.0, 30.0, 40.0, 100.0};

        System.out.println("Average of dataPoints is: " + SafeInput.getAverage(dataPoints2));
    }

}