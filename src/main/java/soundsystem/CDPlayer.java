package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/9/11.
 */
@Component
public class CDPlayer implements MediaPlayer{


    private CompactDisc cd;
    @Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
    @Autowired(required = true)
    public CDPlayer(CompactDisc cd){
      this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
