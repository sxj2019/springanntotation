package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springanntotation
 * @description:
 * @author: sxj
 * @create: 2019-09-12 18:11
 **/

@Service
public class GirlService {
    @Autowired
    public GirlRepository girlRepository;

    public void saveGirl(){
        girlRepository.inserGirl();
    }
}
