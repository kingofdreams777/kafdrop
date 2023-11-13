package kafdrop.model;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Schema(description = "Create topic model")
public final class CreateTopicVO {
  @Parameter(description = "Topic name")
  String name;

  @Parameter(description = "Number of partitions")
  int partitionsNumber;

  @Parameter(description = "Replication factor")
  int replicationFactor;

  public String getName() {
    return this.name;
  }

  public int getPartitionsNumber() {
    return this.partitionsNumber;
  }

  public int getReplicationFactor() {
    return this.replicationFactor;
  }
}
