package thePackmaster.packs;

import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.localization.UIStrings;
import thePackmaster.SpireAnniversary5Mod;
import thePackmaster.cards.creativitypack.*;
import thePackmaster.cards.downfallpack.*;

import java.util.ArrayList;

public class CreativityPack extends AbstractCardPack {
    public static final String ID = SpireAnniversary5Mod.makeID("CreativityPack");
    private static final UIStrings UI_STRINGS = CardCrawlGame.languagePack.getUIString(ID);
    public static final String NAME = UI_STRINGS.TEXT[0];
    public static final String DESC = UI_STRINGS.TEXT[1];
    public static final String AUTHOR = UI_STRINGS.TEXT[2];

    public CreativityPack() {
        super(ID, NAME, DESC, AUTHOR, new PackSummary(3, 3, 4, 3, 1, PackSummary.Tags.Tokens));
    }

    @Override
    public ArrayList<String> getCards() {
        ArrayList<String> cards = new ArrayList<>();
        cards.add(AccumulativeStrike.ID);
        cards.add(BarrierBeacon.ID);
        cards.add(CraftyMove.ID);
        cards.add(Firewall.ID);
        cards.add(MakeshiftSword.ID);
        cards.add(MakeshiftShield.ID);
        cards.add(Mimicry.ID);
        cards.add(Souvenirs.ID);
        cards.add(StrikingStrike.ID);
        cards.add(PaintBrush.ID);
        return cards;
    }
}
