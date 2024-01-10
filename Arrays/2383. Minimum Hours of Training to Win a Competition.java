class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        
        int training=0;
        int len=experience.length;

        for(int i=0;i<len;i++){

            if(energy[i]>=initialEnergy){
                int dif=energy[i]-initialEnergy;
                training+=dif+1;
                initialEnergy+=dif+1;
            }

    if(experience[i]>=initialExperience){
         int dif=experience[i]-initialExperience;
            training+=dif+1;
            initialExperience+=dif+1;
            }

            initialExperience+=experience[i];
           initialEnergy-=energy[i];

        }

        return training;
    }
}
