import lombok.Data;

@Data

public class IpInfo {
    private String province;
    private Integer counter;

    public IpInfo() {

    }
    public IpInfo(String province, Integer counter){
        super();
        this.province = province;
        this.counter = counter;
    }
}
