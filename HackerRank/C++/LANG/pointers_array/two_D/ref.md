# UNDERSTAND THIS

```c++


int **dynamicArray = 0;

// memory allocated for elements of rows. 
dynamicArray = new int *[ROWS];

// memory allocated for  elements of each column.  
for( int i = 0 ; i < ROWS ; i++ ) {
    dynamicArray[i] = new int[COLUMNS];
}

// free the allocated memory 
for( int i = 0 ; i < ROWS ; i++ ) {
    delete [] dynamicArray[i];
}
delete [] dynamicArray;

```