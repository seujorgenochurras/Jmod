package net.jotinha.jmod.block.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class RiaxoIce extends Block {
    public RiaxoIce(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {


        if (!worldIn.isRemote()) {
            if (handIn == Hand.MAIN_HAND) {
                System.out.println("eu dei click direito no firestone block (main-hand)");
            }

            if (handIn == Hand.OFF_HAND) {
                System.out.println("eu dei click direito no firestone block (OFF-hand)");

            }
        }
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);

    }

    @SuppressWarnings("deprecation")

    @Override
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        if (!worldIn.isRemote()) {
            System.out.println("eu dei click esquerdo no firestone block (main-hand)");
        }
    }

    private void gainSpeedBoost(PlayerEntity playerEntity) {
        playerEntity.addPotionEffect(new EffectInstance(Effects.SPEED, 1, 1));
    }


    @Override
    public void onEntityWalk(World world, BlockPos blockPos, Entity entityIn) {
        //Firestone.lightEntityOnFire(entityIn,3 );
        if (entityIn instanceof PlayerEntity) {
            gainSpeedBoost((PlayerEntity) entityIn);


        }

    }





}
