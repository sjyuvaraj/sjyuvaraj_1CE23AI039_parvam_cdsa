#include <stdio.h>

int main()
{
    char foodType = '\0';
    int choice = 0;
    printf("Welcome to Madurai Cafe\n");
    do
    {
        printf("V:Veg N:Nonveg, \nYour choice plz: ");
        fflush(stdin);
        scanf("%c",&foodType);
        foodType=tolower(foodType);
        switch (foodType)
        {
            case 'v':
            printf("1:Banne-Dosa 2:Upma 3:Rava-idli \nYour choice? ");
            scanf("%d", &choice);
            switch (choice)
            {
                case 1:
                  printf("Your Tasty dosa Sir");
                    break;
                case 2:
                    printf("Your yummy upma Maam");
                    break;
                case 3:
                    printf("Your delicious idli Sir");
                    break;
                default:
                                                                                                           
                    printf("We dont serve Grass Sir");
                    break;
             }
             break;
        case 'n':
            printf("1:Mutton-pulav 2:Chicken-chilly 3:Fish-fry.\n Your choice plz");
            scanf("%d", &choice);
            switch (choice)
            {
                case 1:
                printf("Your Tasty Hanumantu");
                break;
                case 2:
                printf("Guntur delicious Chicken Maam");
                break;
                case 3:
                printf("Your spicy fish fry Maam");
                break;
                default:
                printf("We dont serve Lizards Maam");
                break;
            }
            break;
        }

        printf("Do you wish to have more?\n 1:Yes 2:No");
        scanf("%d", &choice);

    } while (choice == 1);
    printf("Thank you Visit again");
    return 0;
}