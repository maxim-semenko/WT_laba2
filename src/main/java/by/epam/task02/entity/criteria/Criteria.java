package by.epam.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

/**
 * Criteria class.
 *
 * @author Maxim Semenko
 * @version 1.0
 */
public class Criteria {
    /**
     * Field criteriaMap contains SearchCriteria for further filtering
     */
    private final Map<String, Object> criteriaMap = new HashMap<>();
    /**
     * Field groupSearchName
     */
    private final String groupSearchName;

    /**
     * Criteria constructor - creating a new Criteria object with parameters
     *
     * @param groupSearchName - group search name
     */
    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    /**
     * Gets groupSearchName
     *
     * @return groupSearchName group search name
     */
    public String getGroupSearchName() {
        return groupSearchName;
    }

    /**
     * Gets criteriaMap
     *
     * @return criteriaMap criteria map
     */
    public Map<String, Object> getCriteriaMap() {
        return criteriaMap;
    }

    /**
     * Adds new SearchCriteria with value to criteriaMap
     *
     * @param searchCriteria the search criteria
     * @param value          the value
     */
    public void add(String searchCriteria, Object value) {
        criteriaMap.put(searchCriteria, value);
    }
}
