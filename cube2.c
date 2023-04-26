#include<stdio.h>
int main(){
    int n,surface_area,volume,curved_surf;
    
    printf("Enter the side :- \n");
    scanf("%i", &n);
    
    
    surface_area=6*(n*n);
    volume=n*n*n;
    curved_surf=4*(n*n);
    
    
    
    printf("surface_area %i\n",surface_area);
    printf("volume %i\n",volume);
    printf("curved_surf %i\n",curved_surf);
    
    return 0;
}
