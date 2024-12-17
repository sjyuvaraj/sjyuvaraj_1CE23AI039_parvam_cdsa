#include <stdio.h>
#include <string.h>
void findAndReplace(char *str, const char *pat, const char *rep) {
char result[1000];
int i, j = 0, k, found;
int patLen = strlen(pat);
int repLen = strlen(rep);
int strLen = strlen(str);
for (i = 0; i < strLen; i++) {
found = 1;
for (k = 0; k < patLen; k++) {
if (str[i + k] != pat[k]) {
found = 0;
break;
}
}
if (found) {
for (k = 0; k < repLen; k++) {
result[j++] = rep[k];
}
i += patLen - 1;
} else {
result[j++] = str[i];
}
}
result[j] = '\0';
strcpy(str, result);
}
int checkPatternExists(char *str, const char *pat) {
int i, k, found;
int patLen = strlen(pat);
int strLen = strlen(str);
for (i = 0; i <= strLen - patLen; i++) {
found = 1;
for (k = 0; k < patLen; k++) {
if (str[i + k] != pat[k]) {
found = 0;
break;
}
}
if (found) {
return 1;
}
}
return 0;
}
int main() {
char str[100], pat[50], rep[50];
printf("Enter the main string (STR): ");
fgets(str, 100, stdin);
str[strcspn(str, "\n")] = '\0'; 
printf("Enter the pattern string (PAT): ");
fgets(pat, 50, stdin);
pat[strcspn(pat, "\n")] = '\0'; 
printf("Enter the replace string (REP): ");
fgets(rep, 50, stdin);
rep[strcspn(rep, "\n")] = '\0'; 
if (checkPatternExists(str, pat)) {
findAndReplace(str, pat, rep);
printf("The modified string is: %s\n", str);
} else {
printf("Pattern '%s' does not exist in the main string.\n", pat);
}
return 0;
}
