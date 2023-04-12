#include <stdio.h>

/* The number of entries processed per loop iteration.                        */
/* Note that this number is a 'constant constant' reflecting the code below.  */
#define BUNCHSIZE (8)

int main(void)
{ 
  int i = 0;                                    /* counter */
  int entries = 50;                             /* total number to process    */
  int repeat;                                   /* number of while repetitions*/
  int left = 0;                                 /* remainder (process later)  */ 
 
  /* If the number of elements is not be divisible by BUNCHSIZE,              */ 
  /* get repeat times required to do most processing in the while loop        */

  repeat = (entries / BUNCHSIZE);                /* number of times to repeat */
  left   = (entries % BUNCHSIZE);                /* calculate remainder       */

  /* Unroll the loop in 'bunches' of 8                                        */ 
  while (repeat--) 
  { 
    printf("process(%d)\n", i    );
    printf("process(%d)\n", i + 1); 
    printf("process(%d)\n", i + 2); 
    printf("process(%d)\n", i + 3); 
    printf("process(%d)\n", i + 4); 
    printf("process(%d)\n", i + 5); 
    printf("process(%d)\n", i + 6); 
    printf("process(%d)\n", i + 7);

    /* update the index by amount processed in one go                         */ 
    i += BUNCHSIZE;
  }

  /* Use a switch statement to process remaining by jumping to the case label */ 
  /* at the label that will then drop through to complete the set             */ 
  switch (left) 
  {
     case 7 : printf("process(%d)\n", i + 6);   /* process and rely on drop 
                                                   through                    */
     case 6 : printf("process(%d)\n", i + 5); 
     case 5 : printf("process(%d)\n", i + 4);  
     case 4 : printf("process(%d)\n", i + 3);  
     case 3 : printf("process(%d)\n", i + 2); 
     case 2 : printf("process(%d)\n", i + 1);   /* two left                   */
     case 1 : printf("process(%d)\n", i);       /* just one left to process   */ 
     case 0 : ;                                 /* none left                  */
  } 
}
