# Take 2 numbers as inputs and find their HCF and LCM.

1. START
2. intitialize hcf,lcm,min,n1,n2,i=1
3. input n1, n2
4. if n1> n2
5. min = n2
6. min = n1
7. while i <= min:
   if (n1 % i == 0 && n2 % i == 0):
   hcf = i
   i = i + 1
   end while
8. lcm = (n1 \* n2) / hcf
9. display {hcf},{lcm}
10. STOP
