package tv.twitch.android.shared.chat.communitypoints;

import android.view.ViewGroup;

import tv.twitch.android.mod.utils.ChatUtils;
import tv.twitch.android.shared.chat.communitypoints.models.CommunityPointsModel;

// Source: CommunityPointsButtonViewDelegate
public class r {
    private final ViewGroup b = null;

    private final void e(CommunityPointsModel communityPointsModel) {
        // TODO: copy communityPointsModel to another register (v4)

        ChatUtils.clicker(b, communityPointsModel); // TODO: __ADD_END
    }
}