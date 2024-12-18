#include<stdio.h>
int main ()
{
int bt[20], wt[20], tat[20], i, n;
float wtavg, tatavg;
printf("\nEnter the number of processes --");
scanf("%d", &n);
for(i=0;i<n;i++)
{
printf("\nEnter Burst Time for Process %d --", i);
scanf("%d", &bt[i]);
}
wt[0] = wtavg = 0;
tat[0] = tatavg = bt[0];
for(i=1;i<n;i++)
{
wt[i] = wt[i-1] +bt[i-1];
tat[i] = tat[i-1] +bt[i];
wtavg = wtavg + wt[i];
tatavg = tatavg + tat[i];
}
printf("\t PROCESS BURST-TIME WAITING-TIME TURNAROUNDTIME\n");
for(i=0;i<n;i++)
printf("\n\t P%d %d %d %d", i, bt[i], wt[i], tat[i]);
printf("\nAverageWaiting Time --%f", wtavg/n);
printf("\nAverage Turnaround Time --%f", tatavg/n);
}