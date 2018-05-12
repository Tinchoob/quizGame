package com.example.martinb.quiz;

import com.example.martinb.quiz.model.Group;
import com.example.martinb.quiz.model.PlayerProfile;
import com.example.martinb.quiz.model.TeamProfile;
import com.example.martinb.quiz.model.Tournament;
import java.util.List;

/**
 * Created by martinb on 3/21/2018.
 */

public interface DataSendContract {

    void setTournaments(List<Tournament> tournaments);
    void setGroups(Group group);
    void setTeamProfile(TeamProfile teamProfile);
    void setPlayerProfile(PlayerProfile playerProfile);
}
