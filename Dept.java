
package ABCS;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Dept {

    @SerializedName("Deptno")
    @Expose
    private Integer deptno;
    @SerializedName("Dname")
    @Expose
    private String dname;
    @SerializedName("Loc")
    @Expose
    private String loc;
    @SerializedName("links")
    @Expose
    private List<Link> links = new ArrayList<Link>();

    /**
     * 
     * @return
     *     The deptno
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * 
     * @param deptno
     *     The Deptno
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * 
     * @return
     *     The dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * 
     * @param dname
     *     The Dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * 
     * @return
     *     The loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * 
     * @param loc
     *     The Loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
